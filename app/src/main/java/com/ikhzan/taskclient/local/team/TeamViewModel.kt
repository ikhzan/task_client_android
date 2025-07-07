package com.ikhzan.taskclient.local.team

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TeamViewModel @Inject constructor(
    private val teamDao: TeamDao
) : ViewModel() {

    suspend fun getTeamByName(name: String) {
        return teamDao.findByName(name)
    }

    suspend fun addTeam(teamModel: TeamModel){
        teamDao.insertTeam(teamModel)
    }

    suspend fun removeTeam(id: Int){
        teamDao.deleteTeam(id)
    }
}