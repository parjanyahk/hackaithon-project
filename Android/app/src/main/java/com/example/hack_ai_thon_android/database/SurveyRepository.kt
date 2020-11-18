package com.example.hack_ai_thon_android.database

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.hack_ai_thon_android.data.SurveyData
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future

class SurveyRepository(application: Application) {
    private val surveyDao: SurveyDao
    private val executorService = Executors.newSingleThreadExecutor()

    init {
        val surveyDatabase = SurveyDatabase.getInstance(application)
        surveyDao = surveyDatabase.surveyDao
    }

    companion object{
        private var surveyRepository: SurveyRepository? = null
        fun getRepository(application: Application): SurveyRepository?{
            if (surveyRepository==null){
                synchronized(SurveyRepository::class.java){
                    if (surveyRepository==null){
                        surveyRepository = SurveyRepository(application)
                    }
                }
            }
            return  surveyRepository
        }
    }

    fun insertSurvey(surveyData: SurveyData){
        executorService.execute {
            surveyDao.insertSurvey(surveyData)
        }
    }

    fun updateSurvey(surveyData: SurveyData){
        executorService.execute {
            surveyDao.updateSurvey(surveyData)
        }
    }

    fun deleteSurvey(surveyData: SurveyData){
        executorService.execute {
            surveyDao.deleteSurvey(surveyData)
        }
    }

    fun getSurveyData(): Future<SurveyData> {
        val callable = Callable<SurveyData>(){
            return@Callable surveyDao.getSurveyData()
        }
       return executorService.submit(callable)
    }
}