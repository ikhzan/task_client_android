package com.ikhzan.taskclient.local.team

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.ikhzan.taskclient.local.user.UserModel

@Dao
interface TeamDao {
    @Query("SELECT * FROM team")
    suspend fun findAll()

    @Query("SELECT * FROM team WHERE name = :name")
    suspend fun findByName(name: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeam(teamModel: TeamModel)

    @Query("DELETE FROM team WHERE id = :id")
    suspend fun deleteTeam(id: Int)

    @Update
    suspend fun updateTeam(teamModel: TeamModel)
}