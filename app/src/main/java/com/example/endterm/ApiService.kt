package com.example.endterm

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET ("posts/")
    fun getTODOs(): Call<List<TODO>>


}