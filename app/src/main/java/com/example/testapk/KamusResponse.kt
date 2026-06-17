package com.example.testapk // Pastikan packagenya sesuai dengan proyekmu

import com.google.gson.annotations.SerializedName

// 1. Model Utama: Membaca data dari Vercel
data class KamusResponse(
    @SerializedName("status")
    val status: String,

    @SerializedName("total_results")
    val totalResults: Int,

    @SerializedName("data")
    val data: List<KamusItem>
)

// 2. Model Item Kata: Membaca isi detail data kata kamus
data class KamusItem(
    @SerializedName("bahasa_sasak")
    val bahasaSasak: String,

    @SerializedName("bahasa_indonesia")
    val bahasaIndonesia: String,

    @SerializedName("kategori")
    val kategori: String
)