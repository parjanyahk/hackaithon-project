package com.example.hack_ai_thon_android.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.ml.ConvertedModel
import com.google.android.gms.tasks.Task
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager
import com.google.firebase.ml.custom.*
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder


class DashboardActivity : AppCompatActivity() {
//    lateinit var firebaseInterpreter: FirebaseModelInterpreter
//    lateinit var interpreter: FirebaseModelInterpreter

//    lateinit var outputFeature0: TensorBuffer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

       val dashBoardViewModel = ViewModelProvider(this).get(DashBoardViewModel::class.java)

        val surveyData = dashBoardViewModel.surveyData
        var sem1 = surveyData.firstSem
        var sem2 = surveyData.firstSem
        var sem3 = surveyData.firstSem
        var sem4 = surveyData.firstSem
        var sem5 = surveyData.firstSem
        var sem6 = surveyData.firstSem
        var sem7 = surveyData.firstSem
        var sem8 = surveyData.firstSem

        var c = surveyData.c
        var cpp = surveyData.cpp
        var java = surveyData.java
        var javaScript = surveyData.javaScript
        var python = surveyData.python
        var kotlin = surveyData.kotlin
        var html = surveyData.htmlFive
        var css = surveyData.cssThree
        var php = surveyData.php
        var r = surveyData.r
        var db = surveyData.database
        var rest = surveyData.restApi

        var mobile = surveyData.mobile
        var mlAi = surveyData.mlAi
        var web = surveyData.web
        var uiux = surveyData.uiUx
        var cloud = surveyData.cloudComp
        var datasci = surveyData.dataSci
        var comp = surveyData.CompCoding
        var ds = surveyData.dataStruct
        var testing = surveyData.testing

        val hours = surveyData.hoursSpentOnAcademics
        var tech = surveyData.technicalClubsJoined
        var extraC = surveyData.extraCurricularActivities
        var video = surveyData.videoTutorials
        var documentation = surveyData.documentation
        var online = surveyData.onlineCourses
        var techBlogs = surveyData.technicalBlogs
        var softSkills = surveyData.softSkillsAndCommunication

        val model = ConvertedModel.newInstance(this)

        val input = Array(1){
            Array(71){
                ByteArray(37)
            }
        }
//
        val byteBuffer = ByteBuffer.allocate(71*37)
    val batchNum = 0
        for (x in 0..70) {
            for (y in 0..36) {
                input[batchNum][x][0] = sem1.toByte()
                input[batchNum][x][1] = sem2.toByte()
                input[batchNum][x][2] = sem3.toByte()
                input[batchNum][x][3] = sem4.toByte()
                input[batchNum][x][4] = sem5.toByte()
                input[batchNum][x][5] = sem6.toByte()
                input[batchNum][x][6] = sem7.toByte()
                input[batchNum][x][7] = sem8.toByte()
                input[batchNum][x][8] = c.toByte()
                input[batchNum][x][9] = cpp.toByte()
                input[batchNum][x][10] = java.toByte()
                input[batchNum][x][11] = javaScript.toByte()
                input[batchNum][x][12] = python.toByte()
                input[batchNum][x][13] = kotlin.toByte()
                input[batchNum][x][14] = html.toByte()
                input[batchNum][x][15] = css.toByte()
                input[batchNum][x][16] = php.toByte()
                input[batchNum][x][17] = r.toByte()
                input[batchNum][x][18] = db.toByte()
                input[batchNum][x][19] = rest.toByte()
                input[batchNum][x][20] = mobile.toByte()
                input[batchNum][x][21] = mlAi.toByte()
                input[batchNum][x][22] = web.toByte()
                input[batchNum][x][23] = uiux.toByte()
                input[batchNum][x][24] = cloud.toByte()
                input[batchNum][x][25] = datasci.toByte()
                input[batchNum][x][26] = comp.toByte()
                input[batchNum][x][27] = ds.toByte()
                input[batchNum][x][28] = testing.toByte()
                input[batchNum][x][29] = hours.toByte()
                input[batchNum][x][30] = tech.toByte()
                input[batchNum][x][31] = extraC.toByte()
                input[batchNum][x][32] = video.toByte()
                input[batchNum][x][33] = documentation.toByte()
                input[batchNum][x][34] = online.toByte()
                input[batchNum][x][35] = techBlogs.toByte()
                input[batchNum][x][36] = softSkills.toByte()
            }
        }

    byteBuffer.order(ByteOrder.nativeOrder())
        for (x in 0..70) {
            for (y in 0..36) {

                byteBuffer.put(input[0][0][y])
            }
        }

// Creates inputs for reference.
        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 71, 37), DataType.FLOAT32)
        inputFeature0.loadBuffer(byteBuffer, intArrayOf(37))

// Runs model inference and gets result.
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer
        val outputArray = outputFeature0.floatArray
        val p1 = outputArray[0]
        val p2 = outputArray[1]
    
    if (p1>p2){
        Toast.makeText(this, "You will be placed", Toast.LENGTH_LONG).show()
    }else{
        Toast.makeText(this, "You will not be placed", Toast.LENGTH_LONG).show()
    }

// Releases model resources if no longer used.
        model.close()
    

}
}