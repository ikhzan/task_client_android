package com.ikhzan.taskclient.local.user

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserModel(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val fullName: String,
    val email: String,
    val userName: String,
    val password: String
)
