<div align="center">

# 🚀 Sasak Search API

### 🌾 Fast • Lightweight • Serverless Dictionary API for Sasak Language 

<p align="center">
  <img src="https://img.shields.io/badge/Language-Sasak-green?style=for-the-badge">
  <img src="https://img.shields.io/badge/API-REST-blue?style=for-the-badge">
  <img src="https://img.shields.io/badge/Deployment-Vercel-black?style=for-the-badge">
  <img src="https://img.shields.io/badge/Status-Online-success?style=for-the-badge">
</p>

<p align="center">
Membantu pelestarian Bahasa Sasak melalui API pencarian kamus yang cepat, modern, dan mudah diintegrasikan ke berbagai aplikasi.
</p>

</div>

---

# ✨ About

> **Sasak Search API** adalah layanan REST API berbasis Node.js yang menyediakan pencarian kosakata Bahasa Sasak ↔ Bahasa Indonesia secara real-time.

API ini dirancang agar:

* ⚡ Cepat dan responsif
* ☁️ Serverless di Vercel
* 📱 Mudah diintegrasikan ke Android, Web, maupun Backend
* 🔍 Mendukung fitur instant search
* 🌾 Mendukung digitalisasi dan pelestarian Bahasa Sasak

---

# 🌐 Live API 

https://sasak-api.vercel.app/

---

# 🔎 Search Endpoint

## Request

```http
GET /api/kamus?search={keyword}
```

## Example

```http
GET https://sasak-api.vercel.app/api/kamus?search=mangan
```

---

# 📦 Response Example

```json
{
  "status": "success",
  "total_results": 1,
  "data": [
    {
      "bahasa_sasak": "mangan",
      "bahasa_indonesia": "makan",
      "kategori": "kata kerja"
    }
  ]
}
```

---

# 🚀 Quick Start

## JavaScript

```javascript
const response = await fetch(
  "https://sasak-api.vercel.app/api/kamus?search=mangan"
);

const data = await response.json();

console.log(data);
```

---

## Kotlin (Retrofit)

```kotlin
@GET("api/kamus")
suspend fun searchWord(
    @Query("search") keyword: String
): KamusResponse
```

---

## cURL

```bash
curl "https://sasak-api.vercel.app/api/kamus?search=mangan"
```

---

# 📱 Integrasi dengan Android Studio

Repository ini ditujukan untuk digunakan pada proyek Android yang dibuat menggunakan **Kotlin** di Android Studio.

API dapat diintegrasikan menggunakan **Retrofit** atau library HTTP lainnya untuk melakukan pencarian kata Bahasa Sasak secara real-time.

---

# 📥 Menggunakan Repository dari Android Studio

## 🔹 Metode 1 — Clone Langsung dari Android Studio (Direkomendasikan)

1. Buka **Android Studio**.
2. Klik menu **File** → **New** → **Project from Version Control**.
3. Pada kolom **URL**, masukkan:

```text
https://github.com/SalmanAlfarisi24/sasak-hub-api.git
```

4. Pilih lokasi penyimpanan project di laptop.
5. Klik **Clone**.
6. Tunggu hingga Android Studio selesai mengunduh repository.
7. Setelah proses selesai, Android Studio akan membuka project secara otomatis.

---

## 🔹 Metode 2 — Clone Menggunakan Git

Pastikan Git telah terpasang pada komputer.

Buka Terminal atau Command Prompt:

```bash
git clone https://github.com/SalmanAlfarisi24/sasak-hub-api.git
```

Masuk ke folder project:

```bash
cd sasak-hub-api
```

Kemudian buka folder tersebut melalui Android Studio:

```text
File → Open → Pilih folder sasak-hub-api
```

---

## 🔹 Metode 3 — Download ZIP

Jika belum menggunakan Git:

1. Buka halaman repository GitHub.
2. Klik tombol **Code**.
3. Pilih **Download ZIP**.
4. Ekstrak file ZIP ke komputer.
5. Buka Android Studio.
6. Pilih **File** → **Open**.
7. Arahkan ke folder hasil ekstraksi.
8. Klik **OK**.

---

# 📊 Features

| Feature                    | Status |
| -------------------------- | ------ |
| 🔍 Keyword Search          | ✅      |
| ⚡ Instant Response         | ✅      |
| ☁️ Serverless Architecture | ✅      |
| 📱 Android Ready           | ✅      |
| 🌐 RESTful API             | ✅      |
| 📦 JSON Response           | ✅      |
| 🆓 Free to Use             | ✅      |

---

# 🏗️ Tech Stack

| Technology | Usage         |
| ---------- | ------------- |
| Node.js    | Runtime       |
| Vercel     | Deployment    |
| JavaScript | Backend Logic |
| JSON       | Data Exchange |
| REST API   | Communication |

---

# 👨‍💻 Author

## Salman Al Farisi

**Mahasiswa Teknik Informatika**
**Universitas Hamzanwadi**

---



<div align="center">

## 🌾 "Melestarikan Bahasa Sasak Melalui Teknologi"

</div>
