package com.example.testapk // Pastikan packagenya sesuai dengan proyekmu

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface KamusApiService {
    @GET("api/kamus")
    suspend fun cariKata(
        @Query("search") kataKunci: String
    ): KamusResponse
}

//OBJECT (Singleton) untuk mengatur koneksi jaringan Retrofit
object ApiClient {
    private const val BASE_URL = "https://sasak-api.vercel.app/"

    val instance: KamusApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(KamusApiService::class.java)
    }
}