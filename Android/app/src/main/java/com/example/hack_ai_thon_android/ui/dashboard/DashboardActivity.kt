package com.example.hack_ai_thon_android.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hack_ai_thon_android.R
import com.example.hack_ai_thon_android.ml.ConvertedModel
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.nio.ByteBuffer

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val model = ConvertedModel.newInstance(this)

// Creates inputs for reference.
        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 71, 37), DataType.FLOAT32)
        val byteBuffer = ByteBuffer.allocate(37)
        inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
        val outputs = model.process(inputFeature0)
        val outputFeature0 = outputs.outputFeature0AsTensorBuffer

// Releases model resources if no longer used.
        model.close()
    }
}