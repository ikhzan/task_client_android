package com.ikhzan.taskclient.local.team

import androidx.room.Entity

@Entity(tableName = "team")
data class TeamModel(
    val id: Int,
    val name: String
)
