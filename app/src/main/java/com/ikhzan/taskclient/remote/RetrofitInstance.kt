package com.ikhzan.taskclient.remote

import com.ikhzan.taskclient.remote.task.TaskService
import com.ikhzan.taskclient.remote.team.TeamService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "http://192.168.1.56:8000/api/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val taskService: TaskService by lazy {
        retrofit.create(TaskService::class.java)
    }

    val teamService: TeamService by lazy {
        retrofit.create(TeamService::class.java)
    }

}