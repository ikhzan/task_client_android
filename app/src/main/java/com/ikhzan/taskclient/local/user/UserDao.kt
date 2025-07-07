package com.ikhzan.taskclient.local.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    suspend fun findAll()

    @Query("SELECT * FROM user WHERE userName = :username")
    suspend fun findByUsername(username: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(userModel: UserModel)

    @Query("DELETE FROM user WHERE userName = :username ")
    suspend fun deleteUser(username: String)
}