package com.ikhzan.taskclient.remote.team

import com.ikhzan.taskclient.local.team.TeamModel
import com.ikhzan.taskclient.remote.RetrofitInstance

class TeamRepository {
    private val teamService = RetrofitInstance.teamService

    suspend fun getTeams(): List<TeamModel>{
        return teamService.getTeams()
    }
}