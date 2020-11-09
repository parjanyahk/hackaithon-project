package com.example.hack_ai_thon_android.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Survey")
data class SurveyData(

    val jobStatus: Int,

    val firstSem: Double,

    val secondSem: Double,

    val thirdSem: Double,

    val fourthSem: Double,

    val fifthSem: Double,

    val sixthSem: Double,

    val seventhSem: Double,

    val eighthSem: Double,

    val c: Int,

    val cpp: Int,

    val java: Int,

    val javaScript: Int,

    val python: Int,

    val kotlin: Int,

    val htmlFive: Int,

    val cssThree: Int,

    val php: Int,

    val r: Int,

    val database: Int,

    val restApi: Int,

    val others: Int,

    val mobile: Int,

    val mlAi: Int,

    val web: Int,

    val uiUx: Int,

    val cloudComp: Int,

    val dataSci: Int,

    val CompCoding: Int,

    val dataStruct: Int,

    val testing: Int,

    val expected: Int,

    val obtained: Int,

    val pDeveloper: Int,

    val pMachineLearningEng: Int,

    val pSoftwareEngineer: Int,

    val pDataAnalyst: Int,

    val pDataScientist: Int,

    val pQualityAssuranceOrTesting: Int,

    val pSystemAdministrator: Int,

    val oDeveloper: Int,

    val oMachineLearningEng: Int,

    val oSoftwareEngineer: Int,

    val oDataAnalyst: Int,

    val oDataScientist: Int,

    val oQualityAssuranceOrTesting: Int,

    val oSystemAdministrator: Int,

    val hoursSpentOnAcademics: Int,

    val technicalClubsJoined: Int,

    val extraCurricularActivities: Int,

    val videoTutorials: Int,

    val documentation: Int,

    val onlineCourses: Int,

    val technicalBlogs: Int,

    val softSkillsAndCommunication: Int,

    @PrimaryKey(autoGenerate = true)
    val surveyID: Long = 0L
)