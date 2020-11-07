package com.example.hack_ai_thon_android.ui.survey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.ui.dashboard.DashboardActivity
import kotlinx.android.synthetic.main.activity_survey_form.*

class SurveyFormActivity : AppCompatActivity() {

    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_form)

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