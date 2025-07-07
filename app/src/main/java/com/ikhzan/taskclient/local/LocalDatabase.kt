package com.ikhzan.taskclient.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ikhzan.taskclient.local.task.TaskDao
import com.ikhzan.taskclient.local.task.TaskModel
import com.ikhzan.taskclient.local.team.TeamDao
import com.ikhzan.taskclient.local.team.TeamModel
import com.ikhzan.taskclient.local.user.UserDao
import com.ikhzan.taskclient.local.user.UserModel

@Database(exportSchema = false, entities = [UserModel::class, TaskModel::class, TeamModel::class], version = 1)
abstract class LocalDatabase : RoomDatabase(){
    abstract fun userDao(): UserDao
    abstract fun taskDao(): TaskDao
    abstract fun teamDao(): TeamDao
}