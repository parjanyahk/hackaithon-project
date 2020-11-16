package com.example.hack_ai_thon_android.ui.dashboard

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.hack_ai_thon_android.R
import com.google.android.gms.tasks.Task
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager
import com.google.firebase.ml.custom.*


class DashboardActivity : AppCompatActivity() {
//    lateinit var firebaseInterpreter: FirebaseModelInterpreter
    lateinit var interpreter: FirebaseModelInterpreter

//    lateinit var outputFeature0: TensorBuffer
    private lateinit var dashBoardViewModel: DashBoardViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        dashBoardViewModel = ViewModelProvider(this).get(DashBoardViewModel::class.java)

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

//    val model = ConvertedModel.newInstance(this)
//
//        var array = arrayOf<Array<Array<Byte>>>()
//
//// Creates inputs for reference.
//    val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 71, 37), DataType.FLOAT32)
//
//    val input = byteArrayOf(sem1.toByte(), sem2.toByte(), sem3.toByte(), sem4.toByte(), sem5.toByte(), sem6.toByte(), sem7.toByte(),
//    sem8.toByte(), c.toByte(), cpp.toByte(), java.toByte(), javaScript.toByte(), python.toByte(), kotlin.toByte(), html.toByte(), css.toByte(),
//    php.toByte(), r.toByte(), db.toByte(), rest.toByte(), mobile.toByte(), mlAi.toByte(), web.toByte(), uiux.toByte(), cloud.toByte(),
//    datasci.toByte(), comp.toByte(), ds.toByte(), testing.toByte(), hours.toByte(), tech.toByte(), extraC.toByte(), video.toByte(), documentation.toByte(),
//    online.toByte(), techBlogs.toByte(), softSkills.toByte())
//
//        val byteBuffer = ByteBuffer.wrap(input)
////        val initialStream: InputStream = ByteArrayInputStream(input)
////
////        while (initialStream.available() > 0){
////            byteBuffer.put(initialStream.read().toByte())
////        }
//
//    inputFeature0.loadBuffer(byteBuffer, intArrayOf(1, 71, 37))
//
//// Runs model inference and gets result.
//        val outputs = model.process(inputFeature0)
//                outputFeature0 = outputs.outputFeature0AsTensorBuffer
//            Toast.makeText(this, ""+outputFeature0.buffer.toString(), Toast.LENGTH_LONG).show()
//
//
//
//
//// Releases model resources if no longer used.
//    model.close()

        val remoteModel = FirebaseCustomRemoteModel.Builder("Placement-Detector").build()

        val conditions = FirebaseModelDownloadConditions.Builder()
            .build()
        FirebaseModelManager.getInstance().download(remoteModel, conditions)
            .addOnCompleteListener {
                // Success.
                Log.v("LOGTAG1", "model download")
//                Activity.RESULT_OK
            }

        val localModel = FirebaseCustomLocalModel.Builder()
            .setAssetFilePath("Placement_Detector.tflite")
            .build()
//
//        FirebaseModelManager.getInstance().isModelDownloaded(remoteModel)
//            .addOnSuccessListener { isDownloaded ->
//                val options =
//                    if (isDownloaded) {
//                        FirebaseModelInterpreterOptions.Builder(remoteModel).build()
//                    } else {
//                        FirebaseModelInterpreterOptions.Builder(localModel).build()
//                    }
//                interpreter = FirebaseModelInterpreter.getInstance(options)!!
//            }
        val interpreterOptions =
            FirebaseModelInterpreterOptions.Builder(localModel).build()
         interpreter = FirebaseModelInterpreter.getInstance(interpreterOptions)!!
//
//        firebaseInterpreter = interpreter
//
        val inputOutputOptions = FirebaseModelInputOutputOptions.Builder()
            .setInputFormat(0, FirebaseModelDataType.FLOAT32, intArrayOf(1, 71, 37))
            .setOutputFormat(0, FirebaseModelDataType.INT32, intArrayOf(1, 1, 2))
            .build()

        val batchNum = 0
        val input = Array(1){
            Array(71){
                FloatArray(37)
            }
        }
//
       val x=0
            input[batchNum][x][0] = sem1.toFloat()
            input[batchNum][x][1] = sem2.toFloat()
            input[batchNum][x][2] = sem3.toFloat()
            input[batchNum][x][3] = sem4.toFloat()
            input[batchNum][x][4] = sem5.toFloat()
            input[batchNum][x][5] = sem6.toFloat()
            input[batchNum][x][6] = sem7.toFloat()
            input[batchNum][x][7] = sem8.toFloat()
            input[batchNum][x][8] = c.toFloat()
            input[batchNum][x][9] = cpp.toFloat()
            input[batchNum][x][10] = java.toFloat()
            input[batchNum][x][11] = javaScript.toFloat()
            input[batchNum][x][12] = python.toFloat()
            input[batchNum][x][13] = kotlin.toFloat()
            input[batchNum][x][14] = html.toFloat()
            input[batchNum][x][15] = css.toFloat()
            input[batchNum][x][16] = php.toFloat()
            input[batchNum][x][17] = r.toFloat()
            input[batchNum][x][18] = db.toFloat()
            input[batchNum][x][19] = rest.toFloat()
            input[batchNum][x][20] = mobile.toFloat()
            input[batchNum][x][21] = mlAi.toFloat()
            input[batchNum][x][22] = web.toFloat()
            input[batchNum][x][23] = uiux.toFloat()
            input[batchNum][x][24] = cloud.toFloat()
            input[batchNum][x][25] = datasci.toFloat()
            input[batchNum][x][26] = comp.toFloat()
            input[batchNum][x][27] = ds.toFloat()
            input[batchNum][x][28] = testing.toFloat()
            input[batchNum][x][29] = hours.toFloat()
            input[batchNum][x][30] = tech.toFloat()
            input[batchNum][x][31] = extraC.toFloat()
            input[batchNum][x][32] = video.toFloat()
            input[batchNum][x][33] = documentation.toFloat()
            input[batchNum][x][34] = online.toFloat()
            input[batchNum][x][35] = techBlogs.toFloat()
            input[batchNum][x][36] = softSkills.toFloat()
//
        val inputs = FirebaseModelInputs.Builder()
            .add(input) // add() as many input arrays as your model requires
            .build()
//        interpreter.run(inputs, inputOutputOptions)
//            .addOnSuccessListener { result ->
//                // ...
//                val output = result.getOutput<Array<FloatArray>>(0)
//                val probabilities1 = output[0]
//                val probabilities2 = output[1]
//                Toast.makeText(this,""+probabilities1+" "+probabilities2,  Toast.LENGTH_LONG).show()
//            }
//            .addOnFailureListener { e ->
//                // Task failed with an exception
//                // ...
//            }

        val task: Task<FirebaseModelOutputs> = interpreter.run(inputs, inputOutputOptions);
        task.addOnSuccessListener{
            val output = it.getOutput<Array<FloatArray>>(0)
            val probabilities1 = output[0]
            Log.v("LOGTAG2", ""+probabilities1)
        }.addOnFailureListener{
            Log.v("LOGTAG2", "error: "+it.message)
        }.addOnCompleteListener {
            interpreter.close()
        }

}
}