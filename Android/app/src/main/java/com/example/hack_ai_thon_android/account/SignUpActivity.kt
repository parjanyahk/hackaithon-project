package com.example.hack_ai_thon_android.account

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.hack_ai_thon_android.ui.dashboard.DashboardActivity
import com.example.hack_ai_thon_android.R
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    lateinit var name: EditText
    lateinit var number: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var confirmedPassword: EditText
    lateinit var submit: Button
    lateinit var signIn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        name = findViewById(R.id.NameEtSignUp)
        number = findViewById(R.id.PhoneEtSignUp)
        email = findViewById(R.id.emailEtSignUp)
        password = findViewById(R.id.passwordEtSignUp)
        confirmedPassword = findViewById(R.id.confPassEtSignUp)
        submit = findViewById(R.id.SignUpBtn)
        signIn = findViewById(R.id.signInTv)

        mAuth = FirebaseAuth.getInstance()

        submit.setOnClickListener {
            var mail = email.text.toString()
            var p1 = password.text.toString()
            var p2 = confirmedPassword.text.toString()

            if (TextUtils.isEmpty(mail) || name.text==null || number.text==null || password.text==null || confirmedPassword.text==null){
                Toast.makeText(this, "Fill in the required details", Toast.LENGTH_LONG).show()
            }else if (p1.length<6){
                Toast.makeText(this, "Password should be more than 6 characters", Toast.LENGTH_LONG).show()
            }else if (p1!=p2){
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }else{
                mAuth.createUserWithEmailAndPassword(mail, p1)
                    .addOnCompleteListener {
                        if (it.isSuccessful()){
                            startActivity(Intent(applicationContext, DashboardActivity::class.java))
                            finish()
                        }else{
                            Toast.makeText(this, "An error has occurred", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

        signIn.setOnClickListener {
            startActivity(Intent(applicationContext, LogInActivity::class.java))
        }

        if (mAuth.currentUser!=null){
            startActivity(Intent(applicationContext, DashboardActivity::class.java))
        }
    }
}