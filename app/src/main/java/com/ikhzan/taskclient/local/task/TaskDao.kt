package com.ikhzan.taskclient.local.task

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {
    @Query("SELECT * FROM task")
    suspend fun findAll()

    @Query("SELECT * FROM task WHERE title = :title")
    suspend fun findByTitle(title: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(taskModel: TaskModel)

    @Query("DELETE FROM task WHERE id = :id")
    suspend fun deleteTask(id: Int)

    @Update
    suspend fun updateTask(taskModel: TaskModel)
}