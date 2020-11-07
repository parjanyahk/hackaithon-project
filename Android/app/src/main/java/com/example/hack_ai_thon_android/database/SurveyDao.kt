package com.example.hack_ai_thon_android.database

import androidx.paging.DataSource
import androidx.room.*
import com.example.hack_ai_thon_android.data.SurveyData

@Dao
interface SurveyDao {

    @Insert
    fun insertSurvey(surveyData: SurveyData)

    @Update
    fun updateSurvey(surveyData: SurveyData)

    @Delete
    fun deleteSurvey(surveyData: SurveyData)

    @Query("SELECT * FROM Survey")
    fun getSurveyData(): DataSource.Factory<Int, SurveyData>
}