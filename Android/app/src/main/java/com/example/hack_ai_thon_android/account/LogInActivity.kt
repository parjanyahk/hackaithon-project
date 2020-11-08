package com.example.hack_ai_thon_android.account

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hack_ai_thon_android.ui.dashboard.DashboardActivity
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.ui.survey.SurveyFormActivity
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import dmax.dialog.SpotsDialog

class LogInActivity : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var forgotPassword: TextView
    private lateinit var signIn: Button
    private lateinit var signUp: TextView
    private val RC_SIGN_IN = 9001
    private lateinit var mAuth: FirebaseAuth
    private lateinit var googleApiClient: GoogleApiClient
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        email = findViewById(R.id.emailEtSignIn)
        password = findViewById(R.id.passwordEtSignIn)
        forgotPassword = findViewById(R.id.forgotPassword)
        signIn = findViewById(R.id.SignInBtn)
        signUp = findViewById(R.id.signUpTv)

        mAuth = FirebaseAuth.getInstance()

        signUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        forgotPassword.setOnClickListener {
            val intent = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intent)
        }

        signIn.setOnClickListener {
            var mail = email.text.toString()
            var p = password.text.toString()
            if (mail.isEmpty() && p.isEmpty()){
                Toast.makeText(this, "Please fill in the credentials", Toast.LENGTH_SHORT).show()
            }else{

                val waitingDialog = SpotsDialog(this)
                waitingDialog.show()
                mAuth.signInWithEmailAndPassword(mail, p)
                    .addOnCompleteListener {
                        if (it.isSuccessful){
                            var user: FirebaseUser = mAuth.currentUser!!
                            waitingDialog.dismiss()
                            updateUI(user)
                        }else{
                            Toast.makeText(this, "Authentication failed.",
                                Toast.LENGTH_SHORT).show();
                            waitingDialog.dismiss()
                            updateUI(null)
                        }
                    }
            }
        }
    }

    private fun updateUI(user: FirebaseUser?){
        if (user!=null){
            val intent = Intent(this, SurveyFormActivity::class.java)
            startActivity(intent)
        }
    }
}