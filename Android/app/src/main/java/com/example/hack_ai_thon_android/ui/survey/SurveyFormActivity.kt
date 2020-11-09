package com.example.hack_ai_thon_android.ui.survey

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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
    var softSkillsAndCommunication = 1
    var jobStatus = 1

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

    var techClubsJoined = 0
    var extraCurricularActivity = 0

    var videoTutorials = 0
    var documentation = 0
    var onlineCourses = 0
    var technicalBlogs = 0

    lateinit var surveyFormViewModel: SurveyFormViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey_form)

        surveyFormViewModel = ViewModelProvider(this).get(SurveyFormViewModel::class.java)

        var sem1 = sgpa1.text
        var sem2 = sgpa2.text
        var sem3 = sgpa3.text
        var sem4 = sgpa4.text
        var sem5 = sgpa5.text
        var sem6 = sgpa6.text
        var sem7 = sgpa7.text
        var sem8 = sgpa8.text


           var c = cet.text!!
            var cpp = cppet.text!!
            var java = javaet.text!!
            var javaScript = jset.text!!
            var python = pythonet.text!!
            var kotlin = kotlinet.text!!
            var htmlFive = htmlet.text!!
            var cssThree = csset.text!!
            var php = phpet.text!!
            var r = ret.text!!
            var database = databaseet.text!!
            var restApi = restApiet.text!!
            var others = otherset.text!!

        when(this.radioGroup.checkedRadioButtonId){
            R.id.RB1 -> softSkillsAndCommunication = 1
            R.id.RB2 -> softSkillsAndCommunication = 2
            R.id.RB3 -> softSkillsAndCommunication = 3
            R.id.RB4 -> softSkillsAndCommunication = 4
            R.id.RB5 -> softSkillsAndCommunication = 5
            R.id.RB6 -> softSkillsAndCommunication = 6
            R.id.RB7 -> softSkillsAndCommunication = 7
            R.id.RB8 -> softSkillsAndCommunication = 8
            R.id.RB9 -> softSkillsAndCommunication = 9
            R.id.RB10 -> softSkillsAndCommunication = 10
        }

//        if(expectPackage.text.toString()!=null || expectedPackage.toString().isNotEmpty()){
           var expectedPackage = expectPackage.text
//
//        }
//        if (obtainPackage.text.toString().isNotEmpty()) {
           var obtainedPackage = obtainPackage.text
//        }


            var mobile = mobDomainEt.text!!
            var mlAi = mlAiDomainEt.text!!
            var web = webDomainEt.text!!
            var uiUx = uiUxDomainEt.text!!
            var cloudComp = cloudCompDomainEt.text!!
            var dataSci = dataSciDomainEt.text!!
            var compCoding = compiCodingDomainEt.text!!
            var dataStruct = dataStructDomainEt.text!!
            var testing = testingDomainEt.text!!

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

        var hoursSpent = workingHours.text

        var techID: Int = technicalClubsRG.checkedRadioButtonId
        when(techID){
            R.id.yesTechClub -> techClubsJoined = 1
            R.id.noTechClub -> techClubsJoined = 0
        }

        var extraID = extraRB.checkedRadioButtonId
        when(extraID){
            R.id.yesExtCurr -> extraCurricularActivity = 1
            R.id.noExtCurr -> extraCurricularActivity = 0
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
            }else if (i==6) {

                if (sem1.isNotEmpty() && sem2.isNotEmpty() && sem3.isNotEmpty() && sem4.isNotEmpty() && sem5.isNotEmpty() && sem6.isNotEmpty() && sem7.isNotEmpty() && sem8.isNotEmpty()
                    && c.isNotEmpty() && cpp.isNotEmpty() && java.isNotEmpty() && javaScript.isNotEmpty() && python.isNotEmpty() && kotlin.isNotEmpty() && htmlFive.isNotEmpty() && cssThree.isNotEmpty() && php.isNotEmpty() && r.isNotEmpty() && database.isNotEmpty() && restApi.isNotEmpty() && others.isNotEmpty()
                    && expectedPackage.isNotEmpty() && obtainedPackage.isNotEmpty() && hoursSpent.isNotEmpty()) {
                    var surveyData = SurveyData(
                        jobStatus,
                        sem1.toString().toFloat(),
                        sem2.toString().toFloat(),
                        sem3.toString().toFloat(),
                        sem4.toString().toFloat(),
                        sem5.toString().toFloat(),
                        sem6.toString().toFloat(),
                        sem7.toString().toFloat(),
                        sem8.toString().toFloat(),
                        c.toString().toInt(),
                        cpp.toString().toInt(),
                        java.toString().toInt(),
                        javaScript.toString().toInt(),
                        python.toString().toInt(),
                        kotlin.toString().toInt(),
                        htmlFive.toString().toInt(),
                        cssThree.toString().toInt(),
                        php.toString().toInt(),
                        r.toString().toInt(),
                        database.toString().toInt(),
                        restApi.toString().toInt(),
                        others.toString().toInt(),
                        mobile.toString().toInt(),
                        mlAi.toString().toInt(),
                        web.toString().toInt(),
                        uiUx.toString().toInt(),
                        cloudComp.toString().toInt(),
                        dataSci.toString().toInt(),
                        compCoding.toString().toInt(),
                        dataStruct.toString().toInt(),
                        testing.toString().toInt(),
                        expectedPackage.toString().toInt(),
                        obtainedPackage.toString().toInt(),
                        pDeveloper,
                        pMachineLearningEng,
                        pSoftwareEngineer,
                        pDataAnalyst,
                        pDataScientist,
                        pQualityAssuranceOrTesting,
                        pSystemAdministrator,
                        oDeveloper,
                        oMachineLearningEng,
                        oSoftwareEngineer,
                        oDataAnalyst,
                        oDataAnalyst,
                        oQualityAssuranceOrTesting,
                        oSystemAdministrator,
                        hoursSpent.toString().toInt(),
                        techClubsJoined,
                        extraCurricularActivity,
                        videoTutorials,
                        documentation,
                        onlineCourses,
                        technicalBlogs,
                        softSkillsAndCommunication
                    )

                    surveyFormViewModel.insertSurvey(surveyData)

                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "error", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                }
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