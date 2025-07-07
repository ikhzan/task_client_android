package com.ikhzan.taskclient.remote.task

import com.ikhzan.taskclient.local.task.TaskModel
import retrofit2.http.GET
import retrofit2.http.POST

interface TaskService {
    @GET("tasks")
    suspend fun getTasks(): List<TaskModel>

    @POST("tasks")
    suspend fun addTask(taskModel: TaskModel): TaskModel

    @GET("tasks/:userId")
    suspend fun getTaskByUser(userId: String): List<TaskModel>
}