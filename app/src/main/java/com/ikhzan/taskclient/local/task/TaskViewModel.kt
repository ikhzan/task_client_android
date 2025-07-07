package com.ikhzan.taskclient.local.task

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TaskViewModel  @Inject constructor(
    private val taskDao: TaskDao
) : ViewModel(){

    suspend fun getTaskByTitle(title: String) {
        return taskDao.findByTitle(title)
    }

    suspend fun addTask(taskModel: TaskModel){
        taskDao.insertTask(taskModel)
    }

    suspend fun removeTask(id: Int){
        taskDao.deleteTask(id)
    }

}