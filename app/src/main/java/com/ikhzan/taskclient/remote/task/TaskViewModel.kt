package com.ikhzan.taskclient.remote.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ikhzan.taskclient.local.task.TaskModel
import kotlinx.coroutines.launch

class TaskViewModel : ViewModel() {
    private val repository = TaskRepository()

    private val _tasks = MutableLiveData<List<TaskModel>>()
    val tasks: LiveData<List<TaskModel>> = _tasks

    fun fetchTasks(){
        viewModelScope.launch {
            try {
                val tasks = repository.getTasks()
                _tasks.value = tasks
            }catch (e: Exception){

            }
        }
    }
}