package com.example.bookapplication

import retrofit2.http.GET

interface Bookinterface {
    @get : GET("books")
    var posts : retrofit2.Call<List<BookDetail?>?>?

    companion object{
        const val BASE_URL = "https://httpapibooks.mocklab.io/"
    }
}

