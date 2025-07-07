package com.ikhzan.taskclient.local.user

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userDao: UserDao
) : ViewModel(){

    suspend fun getUserByUsername(username: String) {
        return userDao.findByUsername(username)
    }

    suspend fun addUser(userModel: UserModel){
        userDao.insertUser(userModel)
    }

    suspend fun removeUser(username: String){
        userDao.deleteUser(username)
    }

}