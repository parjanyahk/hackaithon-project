package com.example.hack_ai_thon_android.ui.survey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.ui.dashboard.DashboardActivity
import kotlinx.android.synthetic.main.activity_survey_form.*
import kotlinx.android.synthetic.main.fragment_sgpa.*
import kotlinx.android.synthetic.main.fragment_skillset.*

class SurveyFormActivity : AppCompatActivity() {

    var i = 0
    var c = 0
    var cpp = 0
    var java = 0
    var javaScript = 0
    var python = 0
    var kotlin = 0
    var htmlFive = 0
    var cssThree = 0
    var php = 0
    var r = 0
    var database = 0
    var restApi = 0
    var others = 0
    var softSkillsAndCommunication = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_form)

        var sem1 = sgpa1.text
        var sem2 = sgpa2.text
        var sem3 = sgpa3.text
        var sem4 = sgpa4.text
        var sem5 = sgpa5.text
        var sem6 = sgpa6.text
        var sem7 = sgpa7.text
        var sem8 = sgpa8.text

        if (cCB.isChecked){
            c = 1
        }
        if (cppCB.isChecked){
            cpp = 1
        }
        if (javaCB.isChecked){
            java = 1
        }
        if (javaScriptCB.isChecked){
            javaScript = 1
        }
        if (pythonCB.isChecked){
            python = 1
        }
        if (kotlinCB.isChecked){
            kotlin = 1
        }
        if (html5CB.isChecked){
            htmlFive = 1
        }
        if (css3CB.isChecked){
            cssThree = 1
        }
        if (phpCB.isChecked){
            php = 1
        }
        if (rCB.isChecked){
            r = 1
        }
        if (databaseCB.isChecked){
            database = 1
        }
        if (restApiCB.isChecked){
            restApi = 1
        }
        if (othersCB.isChecked){
            others = 1
        }

        if (RB1.isChecked){
            softSkillsAndCommunication = 1
        }else if (RB2.isChecked){
            softSkillsAndCommunication = 2
        }else if (RB3.isChecked){
            softSkillsAndCommunication = 3
        }else if (RB4.isChecked){
            softSkillsAndCommunication = 4
        }else if (RB5.isChecked){
            softSkillsAndCommunication = 5
        }else if (RB6.isChecked){
            softSkillsAndCommunication = 6
        }else if (RB7.isChecked){
            softSkillsAndCommunication = 7
        }else if(RB8.isChecked){
            softSkillsAndCommunication = 8
        }else if(RB9.isChecked){
            softSkillsAndCommunication = 9
        }else if (RB10.isChecked){
            softSkillsAndCommunication = 10
        }

        back.setOnClickListener{
            if (i>0){
                i--
                getScreen(i)
            }
        }

        next.setOnClickListener {
            if (i<7){
                i++
                getScreen(i)
            }else if (i==7){
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            }
        }

        if (i==7){
            next.setImageResource(R.drawable.ic_baseline_check_24)
        }
    }

    fun getScreen(i: Int){
        when(i){
            0 -> {
                frameLayout_sgpa.visibility = View.VISIBLE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
            }
            1 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.VISIBLE
            }
            2 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.VISIBLE
                frameLayout_skillSet.visibility = View.GONE
            }
            3 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.VISIBLE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
            }
            4 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.VISIBLE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
            }
        }
    }
}