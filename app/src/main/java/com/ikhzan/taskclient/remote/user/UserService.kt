package com.ikhzan.taskclient.remote.user

import com.ikhzan.taskclient.local.user.UserModel
import retrofit2.http.GET
import retrofit2.http.POST

interface UserService {
    @GET("users")
    suspend fun getUsers(): List<UserModel>

    @POST("users")
    suspend fun register(userModel: UserModel): String

    @POST("users")
    suspend fun login(userModel: UserModel): String

}