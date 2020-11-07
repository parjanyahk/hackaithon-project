package com.example.hack_ai_thon_android.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hack_ai_thon_android.data.ReportData
import com.example.hack_ai_thon_android.data.SurveyData
import java.util.concurrent.Executors

@Database(entities = [SurveyData::class, ReportData::class], version = 1, exportSchema = false)
abstract class SurveyDatabase: RoomDatabase() {

     abstract val surveyDao: SurveyDao

    companion object{
        val executorService = Executors.newSingleThreadExecutor()

        @Volatile
        private var INSTANCE: SurveyDatabase? = null

        fun getInstance(context: Context): SurveyDatabase{
            synchronized(this){
                var instance: SurveyDatabase? = INSTANCE
                if (instance==null) {
                    INSTANCE = Room.databaseBuilder(context, SurveyDatabase::class.java, "Database")
                        .fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance!!
            }
        }
    }
}