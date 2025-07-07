package com.ikhzan.taskclient.local

import android.content.Context
import androidx.room.Room
import com.ikhzan.taskclient.local.task.TaskDao
import com.ikhzan.taskclient.local.team.TeamDao
import com.ikhzan.taskclient.local.user.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideLocalDatabase(@ApplicationContext context: Context): LocalDatabase{
        return Room.databaseBuilder(
            context,
            LocalDatabase::class.java,
            "local.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideUserDao(localDatabase: LocalDatabase) : UserDao{
        return localDatabase.userDao()
    }

    @Provides
    @Singleton
    fun provideTaskDao(localDatabase: LocalDatabase) : TaskDao{
        return localDatabase.taskDao()
    }

    @Provides
    @Singleton
    fun provideTeamDao(localDatabase: LocalDatabase) : TeamDao{
        return localDatabase.teamDao()
    }

}