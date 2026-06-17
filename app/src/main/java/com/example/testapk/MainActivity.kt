package com.example.testapk // Sesuaikan dengan nama package aplikasimu

import com.example.testapk.ApiClient
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    // Deklarasi Komponen UI sesuai ID di layout anda
    private lateinit var etSearchKey: EditText
    private lateinit var btnSearch: ImageButton
    private lateinit var progressBar: ProgressBar
    private lateinit var rvKamusResult: RecyclerView
    private lateinit var kamusAdapter: KamusAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi Komponen UI
        etSearchKey = findViewById(R.id.etSearchKey)
        btnSearch = findViewById(R.id.btnSearch)
        progressBar = findViewById(R.id.progressBar)
        rvKamusResult = findViewById(R.id.rvKamusResult)

        // Setup RecyclerView awal dengan List Kosong
        kamusAdapter = KamusAdapter(arrayListOf())
        rvKamusResult.adapter = kamusAdapter

        // Aksi ketika Tombol Cari diklik
        btnSearch.setOnClickListener {
            val kataKunci = etSearchKey.text.toString().trim()

            if (kataKunci.isNotEmpty()) {
                // Jalankan fungsi pencarian ke API Vercel
                fetchKamusData(kataKunci)
            } else {
                Toast.makeText(this, "Silakan masukkan kata kunci!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Fungsi untuk mengambil data dari API menggunakan Coroutines
    private fun fetchKamusData(query: String) {
        // Tampilkan ProgressBar sebelum request dimulai
        progressBar.visibility = View.VISIBLE

        // Menjalankan network request
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // Memanggil instance Retrofit ApiClient
                val response = ApiClient.instance.cariKata(query)

                // Kembali ke Main Thread (Dispatchers.Main)
                withContext(Dispatchers.Main) {
                    progressBar.visibility = View.GONE

                    if (response.status == "success" && response.data.isNotEmpty()) {
                        kamusAdapter.updateData(response.data)
                    } else {
                        Toast.makeText(this@MainActivity, "Kata tidak ditemukan", Toast.LENGTH_SHORT).show()
                        kamusAdapter.updateData(arrayListOf()) // Kosongkan list jika tidak ketemu
                    }
                }
            } catch (e: Exception) {
                // Menangani error jika koneksi internet putus atau server Vercel bermasalah
                withContext(Dispatchers.Main) {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this@MainActivity, "Gagal terhubung ke server: ${e.message}", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}