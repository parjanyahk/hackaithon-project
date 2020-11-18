package com.example.hack_ai_thon_android.ui.dashboard

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.hack_ai_thon_android.data.SurveyData
import com.example.hack_ai_thon_android.database.SurveyRepository

class DashBoardViewModel(application: Application): AndroidViewModel(application) {

    val repository = SurveyRepository.getRepository(application)!!
    val surveyData: SurveyData

    init {
        surveyData = repository.getSurveyData().get()
    }
}