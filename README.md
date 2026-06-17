# 🚀 Sasak Search API

<div align="center">

### 🌾 Fast • Lightweight • Serverless Dictionary API for Sasak Language

Membantu pelestarian Bahasa Sasak melalui API pencarian kamus yang cepat, modern, dan mudah diintegrasikan ke berbagai aplikasi.

[![Deploy on Vercel](https://img.shields.io/badge/Hosted%20on-Vercel-black?style=for-the-badge\&logo=vercel)](https://sasak-api.vercel.app/)
[![Node.js](https://img.shields.io/badge/Node.js-18+-green?style=for-the-badge\&logo=node.js)](https://nodejs.org/)
[![REST API](https://img.shields.io/badge/API-REST-blue?style=for-the-badge)](https://sasak-api.vercel.app/)
[![Open Source](https://img.shields.io/badge/Open%20Source-Yes-orange?style=for-the-badge)]()

</div>

---

## ✨ About

**Sasak Search API** adalah layanan REST API berbasis Node.js yang menyediakan pencarian kosakata Bahasa Sasak ↔ Bahasa Indonesia secara real-time.

API ini dirancang agar:

* ⚡ Cepat dan responsif
* ☁️ Serverless di Vercel
* 📱 Mudah diintegrasikan ke Android, Web, maupun Backend
* 🔍 Mendukung fitur instant search
* 🌾 Mendukung digitalisasi dan pelestarian Bahasa Sasak

---

## 🌐 Live API

```bash
https://sasak-api.vercel.app/
```

---

## 🔎 Search Endpoint

### Request

```http
GET /api/kamus?search={keyword}
```

### Example

```http
GET https://sasak-api.vercel.app/api/kamus?search=mangan
```

---

## 📦 Response Example

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

## 🚀 Quick Start

### JavaScript

```javascript
const response = await fetch(
  "https://sasak-api.vercel.app/api/kamus?search=mangan"
);

const data = await response.json();

console.log(data);
```

### Kotlin (Retrofit)

```kotlin
@GET("api/kamus")
suspend fun searchWord(
    @Query("search") keyword: String
): KamusResponse
```

### cURL

```bash
curl "https://sasak-api.vercel.app/api/kamus?search=mangan"
```

---

## 📊 Features

* 🔍 Keyword Search
* ⚡ Instant Response
* ☁️ Serverless Architecture
* 📱 Android Ready
* 🌐 RESTful API
* 📦 JSON Response
* 🆓 Free to Use

---

## 🏗️ Tech Stack

| Technology | Usage         |
| ---------- | ------------- |
| Node.js    | Runtime       |
| Vercel     | Deployment    |
| JavaScript | Backend Logic |
| JSON       | Data Exchange |
| REST API   | Communication |

---

## 🌾 Mission

Bahasa daerah merupakan bagian penting dari identitas budaya Indonesia.

Melalui proyek ini, kami berupaya menyediakan akses digital yang lebih mudah terhadap Bahasa Sasak agar dapat dimanfaatkan oleh:

* Mahasiswa
* Peneliti
* Guru dan Pelajar
* Developer
* Komunitas Pelestari Budaya

---

## 👨‍💻 Author

**Salman Al Farisi**

Informatics Engineering Student
Universitas Hamzanwadi

---

## ❤️ Support The Project

Jika proyek ini bermanfaat:

⭐ Berikan Star pada repository ini

🍴 Fork dan kembangkan

🤝 Berkontribusi untuk pelestarian Bahasa Sasak

---

<div align="center">

### 🌾 "Melestarikan Bahasa Sasak Melalui Teknologi"

</div>
