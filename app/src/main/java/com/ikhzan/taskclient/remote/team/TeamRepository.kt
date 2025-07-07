package com.ikhzan.taskclient.remote.team

import com.ikhzan.taskclient.local.task.TaskModel
import com.ikhzan.taskclient.local.team.TeamModel
import com.ikhzan.taskclient.remote.RetrofitInstance

class TeamRepository {
    private val teamService = RetrofitInstance.teamService

    suspend fun getTeams(): List<TeamModel>{
        return teamService.getTeams()
    }

    suspend fun addTeam(teamModel: TeamModel){
       teamService.addTeam(teamModel)
    }
}