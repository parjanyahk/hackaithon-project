package com.example.hack_ai_thon_android.ui.survey

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.hack_ai_thon_android.data.SurveyData
import com.example.hack_ai_thon_android.database.SurveyRepository

class SurveyFormViewModel(application: Application): AndroidViewModel(application) {

    val repository = SurveyRepository.getRepository(application)!!

    public fun insertSurvey(surveyData: SurveyData){
        repository.insertSurvey(surveyData)
    }
}