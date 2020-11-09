package com.example.hack_ai_thon_android.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.ml.ConvertedModel
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.nio.ByteBuffer

class DashboardActivity : AppCompatActivity() {
//    lateinit var dashBoardViewModel: DashBoardViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

//        dashBoardViewModel = ViewModelProvider(this).get(DashBoardViewModel::class.java)

//        val surveyData = dashBoardViewModel.surveyData
//        var sem1 = surveyData.firstSem
//        var sem2 = surveyData.firstSem
//        var sem3 = surveyData.firstSem
//        var sem4 = surveyData.firstSem
//        var sem5 = surveyData.firstSem
//        var sem6 = surveyData.firstSem
//        var sem7 = surveyData.firstSem
//        var sem8 = surveyData.firstSem
//
//        var c = surveyData.c
//        var cpp = surveyData.cpp
//        var java = surveyData.java
//        var javaScript = surveyData.javaScript
//        var python = surveyData.python
//        var kotlin = surveyData.kotlin
//        var html = surveyData.htmlFive
//        var css = surveyData.cssThree
//        var php = surveyData.php
//        var r = surveyData.r
//        var db = surveyData.database
//        var rest = surveyData.restApi
//
//        var mobile = surveyData.mobile
//        var mlAi = surveyData.mlAi
//        var web = surveyData.web
//        var uiux = surveyData.uiUx
//        var cloud = surveyData.cloudComp
//        var datasci = surveyData.dataSci
//        var comp = surveyData.CompCoding
//        var ds = surveyData.dataStruct
//        var testing = surveyData.testing
//
//        val hours = surveyData.hoursSpentOnAcademics
//        var tech = surveyData.technicalClubsJoined
//        var extraC = surveyData.extraCurricularActivities
//        var video = surveyData.videoTutorials
//        var documentation = surveyData.documentation
//        var online = surveyData.onlineCourses
//        var techBlogs = surveyData.technicalBlogs
//        var softSkills = surveyData.softSkillsAndCommunication

//        val model = ConvertedModel.newInstance(this)
//
//// Creates inputs for reference.
//        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(8, 8, 8, 8, 8, 8, 8, 8, 2, 6, 2, 5, 8, 5, 9, 1, 3, 9, 2, 5, 1, 5, 9, 3, 4, 8, 1, 6, 9, 2500, 0, 1, 0, 0, 1, 1, 7 ), DataType.FLOAT32)
//        val byteBuffer = ByteBuffer.allocate(37)
//        inputFeature0.loadBuffer(byteBuffer)
//
//// Runs model inference and gets result.
//        val outputs = model.process(inputFeature0)
//        val outputFeature0 = outputs.outputFeature0AsTensorBuffer
//
//        Toast.makeText(this, " "+outputFeature0, Toast.LENGTH_LONG).show()
//
//// Releases model resources if no longer used.
//        model.close()
    }
}