package com.ikhzan.taskclient.remote.team

import com.ikhzan.taskclient.local.team.TeamModel
import retrofit2.http.GET
import retrofit2.http.POST

interface TeamService {
    @GET("teams")
    suspend fun getTeams(): List<TeamModel>

    @POST("teams")
    suspend fun addTeam(teamModel: TeamModel): TeamModel

    @GET("teams/:userId")
    suspend fun getTeamByUser(userId: String): List<TeamModel>
}