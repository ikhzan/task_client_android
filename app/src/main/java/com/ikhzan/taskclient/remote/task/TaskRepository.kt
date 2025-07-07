package com.ikhzan.taskclient.remote.task

import com.ikhzan.taskclient.local.task.TaskModel
import com.ikhzan.taskclient.remote.RetrofitInstance

class TaskRepository {
    private val taskService = RetrofitInstance.taskService

    suspend fun getTasks(): List<TaskModel>{
        return taskService.getTasks()
    }

    suspend fun addTask(taskModel: TaskModel){
        taskService.addTask(taskModel)
    }
}