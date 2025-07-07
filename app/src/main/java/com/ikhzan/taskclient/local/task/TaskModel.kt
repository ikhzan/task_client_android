package com.ikhzan.taskclient.local.task

import androidx.room.Entity

@Entity(tableName = "task")
data class TaskModel(
    val id: Int,
    val title: String,
    val description: String,
    val priority: Int
)
