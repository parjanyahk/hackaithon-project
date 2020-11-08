package com.example.hack_ai_thon_android.ui.survey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.RadioButton
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.data.SurveyData
import com.example.hack_ai_thon_android.ui.dashboard.DashboardActivity
import kotlinx.android.synthetic.main.activity_survey_form.*
import kotlinx.android.synthetic.main.fragment_domain.*
import kotlinx.android.synthetic.main.fragment_job.*
import kotlinx.android.synthetic.main.fragment_learning1.*
import kotlinx.android.synthetic.main.fragment_learning2.*
import kotlinx.android.synthetic.main.fragment_package.*
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
    var jobStatus = 1


    var mobile = 0
    var mlAi = 0
    var web = 0
    var uiUx = 0
    var cloudComp = 0
    var dataSci = 0
    var compCoding = 0
    var dataStruct = 0
    var testing = 0

    var pDeveloper = 0
    var pMachineLearningEng = 0
    var pSoftwareEngineer = 0
    var pDataAnalyst = 0
    var pDataScientist = 0
    var pQualityAssuranceOrTesting = 0
    var pSystemAdministrator = 0
    var oDeveloper = 0
    var oMachineLearningEng = 0
    var oSoftwareEngineer = 0
    var oDataAnalyst = 0
    var oDataScientist = 0
    var oQualityAssuranceOrTesting = 0
    var oSystemAdministrator = 0

    var videoTutorials = 0
    var documentation = 0
    var onlineCourses = 0
    var technicalBlogs = 0


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

        var id: Int = radioGroup.checkedRadioButtonId
        var radioButton: RadioButton = findViewById(id)
        softSkillsAndCommunication = radioButton.text.toString().toInt()

        var expectedPackage = expectedPackage.text.toString().toLong()
        var obtainedPackage = obtainedPackage.text.toString().toLong()

        if (mobileCB.isChecked){
            mobile = 1
        }
        if (ml_or_ai.isChecked){
            mlAi = 1
        }
        if (webDevelopment.isChecked){
            web = 1
        }
        if (ui_and_ux.isChecked){
            uiUx = 1
        }
        if (cloudComputing.isChecked){
            cloudComp = 1
        }
        if (dataScience.isChecked){
            dataSci = 1
        }
        if (competitiveCoding.isChecked){
            compCoding = 1
        }
        if (dataStructers.isChecked){
            dataStruct = 1
        }
        if (testingCB.isChecked){
            testing = 1
        }

        if (prefDeveloper.isChecked){
            pDeveloper = 1
        }
        if (prefQualityAssurance.isChecked){
            pQualityAssuranceOrTesting = 1
        }
        if (prefSystemAdministrator.isChecked){
            pSystemAdministrator = 1
        }
        if (prefSoftwareEngineer.isChecked){
            pSoftwareEngineer = 1
        }
        if (prefMachineLearningEngineer.isChecked){
            pMachineLearningEng = 1
        }
        if (prefDataAnalyst.isChecked){
            pDataAnalyst= 1
        }
        if (prefDataScientist.isChecked){
            pDataScientist = 1
        }

        if (obtDeveloper.isChecked){
            oDeveloper = 1
        }
        if (obtQualityAssurance.isChecked){
            oQualityAssuranceOrTesting = 1
        }
        if (obtSystemAdministrator.isChecked){
            oSystemAdministrator = 1
        }
        if (obtSoftwareEngineer.isChecked){
            oSoftwareEngineer = 1
        }
        if (obtMachineLearningEngineer.isChecked){
            oMachineLearningEng = 1
        }
        if (obtDataAnalyst.isChecked){
            oDataAnalyst= 1
        }
        if (obtDataScientist.isChecked){
            oDataScientist = 1
        }
        if (didNotGetaJob.isChecked){
            jobStatus = 0
        }

        var hoursID: Int = hoursSpentRG.checkedRadioButtonId
        var hoursRB: RadioButton = findViewById(hoursID)
        var hoursSpent = hoursRB.text

        var techID: Int = technicalClubsRG.checkedRadioButtonId
        var techRB: RadioButton = findViewById(techID)
        var tech = techRB.text
        var techClubsJoined = 0
        if (tech.equals("YES")){
            techClubsJoined = 1
        }else{
            techClubsJoined = 0
        }

        var extraID = extraRB.checkedRadioButtonId
        var extraRB: RadioButton = findViewById(extraID)
        var extra = extraRB.text
        var extraCurricularActivity = 0
        if (extra.equals("YES")){
            extraCurricularActivity = 1
        }else{
            extraCurricularActivity = 0
        }

        if (videoTutorialsCB.isChecked){
            videoTutorials = 1
        }
        if (documentationCB.isChecked){
            documentation = 1
        }
        if (onlineCoursesCB.isChecked){
            onlineCourses = 1
        }
        if (technicalBlogsCB.isChecked){
            technicalBlogs = 1
        }



        back.setOnClickListener{
            if (i>0){
                i--
                getScreen(i)
            }
        }

        next.setOnClickListener {
            if (i<6){
                i++
                getScreen(i)
            }else if (i==6){

                var surveyData = SurveyData(jobStatus, sem1.toString().toDouble(), sem2.toString().toDouble(), sem3.toString().toDouble(),
                sem4.toString().toDouble(), sem5.toString().toDouble(), sem6.toString().toDouble(), sem7.toString().toDouble(), sem8.toString().toDouble(),
                c, cpp, java, javaScript, python, kotlin, htmlFive, cssThree, php, r, database, restApi, others, mobile, mlAi, web, uiUx, cloudComp, dataSci,
                compCoding, dataStruct, testing, expectedPackage, obtainedPackage, pDeveloper, pMachineLearningEng, pSoftwareEngineer, pDataAnalyst,
                pDataScientist, pQualityAssuranceOrTesting, pSystemAdministrator, oDeveloper, oMachineLearningEng, oSoftwareEngineer, oDataAnalyst, oDataAnalyst,
                oQualityAssuranceOrTesting, oSystemAdministrator, hoursSpent.toString().toInt(), techClubsJoined, extraCurricularActivity, videoTutorials,
                documentation, onlineCourses, technicalBlogs, softSkillsAndCommunication)

                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            }
        }

        if (i==6){
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
                frameLayout_learning1.visibility = View.GONE
                frameLayout_learning2.visibility = View.GONE
            }
            1 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.VISIBLE
                frameLayout_learning1.visibility = View.GONE
                frameLayout_learning2.visibility = View.GONE
            }
            2 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.VISIBLE
                frameLayout_skillSet.visibility = View.GONE
                frameLayout_learning1.visibility = View.GONE
                frameLayout_learning2.visibility = View.GONE
            }
            3 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.VISIBLE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
                frameLayout_learning1.visibility = View.GONE
                frameLayout_learning2.visibility = View.GONE
            }
            4 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.VISIBLE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
                frameLayout_learning1.visibility = View.GONE
                frameLayout_learning2.visibility = View.GONE
            }
            5 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
                frameLayout_learning1.visibility = View.VISIBLE
                frameLayout_learning2.visibility = View.GONE
            }
            6 -> {
                frameLayout_sgpa.visibility = View.GONE
                frameLayout_domain.visibility = View.GONE
                frameLayout_job.visibility = View.GONE
                frameLayout_package.visibility = View.GONE
                frameLayout_skillSet.visibility = View.GONE
                frameLayout_learning1.visibility = View.GONE
                frameLayout_learning2.visibility = View.VISIBLE
            }

        }
    }
}