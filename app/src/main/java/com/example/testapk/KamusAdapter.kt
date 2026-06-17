package com.example.testapk // Sesuaikan dengan nama package aplikasimu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KamusAdapter(private var listKata: List<KamusItem>) :
    RecyclerView.Adapter<KamusAdapter.KamusViewHolder>() {

    // ViewHolder berfungsi untuk mengenali komponen UI di dalam item_kamus.xml
    class KamusViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvSasak: TextView = itemView.findViewById(R.id.tvSasak)
        val tvIndonesia: TextView = itemView.findViewById(R.id.tvIndonesia)
        val tvKategori: TextView = itemView.findViewById(R.id.tvKategori)
    }

    // Menghubungkan layout item_kamus.xml ke dalam Adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KamusViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_kamus, parent, false)
        return KamusViewHolder(view)
    }

    // Memasukkan data dari listKata ke dalam komponen UI berdasarkan posisinya
    override fun onBindViewHolder(holder: KamusViewHolder, position: Int) {
        val item = listKata[position]
        holder.tvSasak.text = item.bahasaSasak
        holder.tvIndonesia.text = "Artinya: ${item.bahasaIndonesia}"
        holder.tvKategori.text = item.kategori
    }

    // Menentukan jumlah total item yang akan ditampilkan
    override fun getItemCount(): Int {
        return listKata.size
    }

    // Fungsi tambahan untuk memperbarui data di RecyclerView saat pencarian baru dilakukan
    fun updateData(newList: List<KamusItem>) {
        this.listKata = newList
        notifyDataSetChanged() // Memberitahu RecyclerView bahwa data telah berubah
    }
}