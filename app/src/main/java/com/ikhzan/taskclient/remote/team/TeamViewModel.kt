package com.ikhzan.taskclient.remote.team

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ikhzan.taskclient.local.task.TaskModel
import com.ikhzan.taskclient.local.team.TeamModel
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {
    private val repository = TeamRepository()

    private val _teams = MutableLiveData<List<TeamModel>>()
    val teams: LiveData<List<TeamModel>> = _teams

    fun fetchTeams(){
        viewModelScope.launch {
            try {
                val tasks = repository.getTeams()
                _teams.value = tasks
            }catch (e: Exception){

            }
        }
    }

    fun addTask(teamModel: TeamModel){
        viewModelScope.launch {
            try {
                repository.addTeam(teamModel)
            }catch (e: Exception){
                Log.d("TAG", "addTask: ")
            }
        }
    }
}