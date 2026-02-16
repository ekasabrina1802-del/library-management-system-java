# 📚 Libralystic – Library Management System (Admin Only)

**Libralystic** adalah aplikasi *Library Management System (LMS)* berbasis desktop yang dirancang khusus untuk **admin** perpustakaan dalam membantu proses digitalisasi pengelolaan koleksi dan transaksi. Aplikasi ini mencakup pendataan buku, pencatatan peminjaman dan pengembalian, hingga pencetakan laporan, semuanya dikendalikan melalui antarmuka admin yang intuitif dan efisien.

> ⚠️ **Catatan**: Aplikasi ini ditujukan hanya untuk penggunaan oleh **administrator** perpustakaan. Tidak ada fitur login/panel khusus untuk pengguna umum atau anggota.

---

## 🎯 Tujuan Aplikasi

Libralystic bertujuan untuk:
- Memberikan sistem manajemen perpustakaan yang terpusat bagi admin.
- Mempermudah pencatatan dan pelacakan transaksi.
- Mendukung pelaporan berbasis data secara real-time.
---

## 🧩 Fitur Utama

Aplikasi Libralystic terbagi dalam tiga bagian utama:

### 1️⃣ Halaman Data (Admin-Only)
Menu ini berfungsi untuk mengatur seluruh data utama perpustakaan, terdiri dari:
- **Dashboard** – Menampilkan ringkasan peminjaman, jumlah anggota, dan koleksi buku.
- **Anggota** – Menambahkan dan mengelola data pengguna atau peminjam.
- **Daftar Buku** – Mengelola koleksi buku perpustakaan.
- **Kategori** – Mengatur kategori buku (fiksi, non-fiksi, referensi, agama, dll.).
- **Penerbit** – Mendata dan mengelola informasi penerbit buku.

### 2️⃣ **Transaksi**
Menu ini mencatat aktivitas peminjaman dan pengembalian buku:
- **Peminjaman** – Mencatat transaksi peminjaman berdasarkan anggota dan buku.
- **Pengembalian** – Mencatat pengembalian buku serta menghitung keterlambatan jika ada.

---

## 🎨 Fokus Desain UI

Desain UI difokuskan pada kemudahan penggunaan oleh admin:
- Layout menggunakan **AbsoluteLayout** untuk fleksibilitas desain.
- Antarmuka ringan dengan tema **FlatLaf**.
- Dukungan ikon modern dari **Flaticon** dan **Icon8**.
- Menampilkan data dalam bentuk **panel interaktif**, bukan hanya tabel.
---

## 🛠️ Tools & Requirement

| Kebutuhan          | Digunakan Untuk                                    |
|--------------------|----------------------------------------------------|
| 💻 NetBeans        | Pengembangan kode program (JavaScript, JavaSwing) |
| 🧩 Laragon         | Local server (Apache, MySQL)                      |
| 🗃️ MySQL Workbench | Desain & manajemen database visual                |
| 🧮 SQLyog Community| Manajemen database berbasis GUI                   |
| 🎨 Flaticon        | Sumber ikon untuk antarmuka                       |
| 🎨 Icon8           | Tambahan ikon dan elemen visual                   |
| ☕ JDK 23 (Default)| Versi Java yang digunakan untuk kompilasi         |

---

## 📦 Library yang Digunakan

Berikut adalah *external libraries* yang digunakan dalam aplikasi:

| Library                      | Kegunaan                                 |
|------------------------------|------------------------------------------|
| `datachooser.jar`            | Komponen pemilihan tanggal               |
| `mysql-connector-j-9.3.0.jar`| Koneksi database MySQL dari Java         |
| `AbsoluteLayout.jar`         | Manajemen layout manual di UI            |
| `flatlaf-3.2.1.jar`          | Tampilan tema modern untuk desktop       |

> 📁 Semua file `.jar` sudah dimasukkan ke folder **Libraries** di dalam proyek NetBeans.

---

## 📁 Struktur Direktori Proyek

📂 Libralystic/
├── 📁 src/
│ ├── 📁 Config/
│ │ └── Koneksi.java
│ ├── 📁 Icon/
│ ├── 📁 Main/
│ │ ├── Dashboard.java
│ │ ├── DaftarBuku.java
│ │ ├── MenuItem.java
│ │ ├── MenuUtama.java
│ │ ├── Peminjaman.java
│ │ ├── SignUp.java
│ │ └── panelAnggota.java
│ ├── 📁 View/
│ │ ├── FormLogin.java
│ │ ├── MenuBuku.java
│ │ ├── MenuDashboard.java
│ │ ├── MenuKategori.java
│ │ ├── MenuPeminjaman.java
│ │ ├── MenuPenerbit.java
│ │ └── MenuPengembalian.java
├── 📁 img/
├── 📁 Test Packages/
├── 📁 Libraries/
│ ├── datechooser.jar
│ ├── mysql-connector-j-9.3.0.jar
│ ├── AbsoluteLayout.jar
│ ├── flatlaf-3.2.1.jar
│ └── JDK 23 (Default)

## 🛠️ Langkah-Langkah Instalasi dan Menjalankan Aplikasi

### 1. Install Semua Tools
Pastikan telah menginstal:
- NetBeans
- JDK 23
- Laragon
- MySQL Workbench atau SQLyog

### 2. Jalankan MySQL via Laragon
- Buka Laragon
- Klik tombol **Start All**
- Pastikan MySQL sudah berjalan (status: Running)

### 3. Setup Database
- Buka **MySQL Workbench** atau **SQLyog**
- Buat database dengan nama:
  ```sql
  CREATE DATABASE db_library;
  ```
- Import file SQL: `db_library.sql` ke dalam database tersebut

### 4. Buka Proyek di NetBeans
- Jalankan NetBeans
- Klik `File > Open Project`
- Arahkan ke folder `Libralystic/`
- Tunggu hingga project berhasil dimuat

### 5. Tambahkan Library Eksternal (Jika Belum)
- Klik kanan proyek > `Properties` > `Libraries` > `Add JAR/Folder`
- Tambahkan semua `.jar` dari folder `Libraries/`

### 6. Jalankan Aplikasi
- Klik kanan `FormLogin.java` atau `MenuUtama.java` > `Run File`
- Form Login akan muncul

---

## 🔐 Penggunaan Aplikasi

### 1. Login
- Masukkan `username` dan `password` admin
- Jika belum memiliki akun:
  - Klik tombol **Sign Up**
  - Isi formulir pendaftaran, lalu kembali ke login

### 2. Menu Utama (Setelah Login)
Admin akan diarahkan ke halaman utama dengan berbagai menu:

---

## 🧭 Navigasi Menu dan Fitur

### 📌 Dashboard
- Menampilkan ringkasan:
  - Jumlah peminjaman
  - Jumlah anggota
  - Jumlah koleksi buku
- Ditampilkan dalam **panel interaktif** dengan ikon dan visual modern

---

### 📌 Menu Anggota
- Fitur:
  - Tambah data anggota
  - Edit data anggota
  - Hapus anggota
  - Tampilkan daftar anggota
- Data yang disimpan meliputi:
  - Nama, NISN, jenis kelamin, alamat, dan nomor kontak

---

### 📌 Menu Daftar Buku
- Fitur:
  - Tambah buku baru (dengan cover/gambar)
  - Edit detail buku
  - Hapus buku
  - Tampilkan koleksi buku per kategori
- Data buku mencakup:
  - Judul, penulis, kategori, penerbit, tahun, stok

---

### 📌 Menu Kategori
- Mengatur kategori buku seperti:
  - Fiksi
  - Non-fiksi
  - Referensi
  - Agama
  - Ilmiah, dll.
- Admin dapat:
  - Tambah, ubah, dan hapus kategori

---

### 📌 Menu Penerbit
- Mendata dan mengelola informasi penerbit buku:
  - Nama penerbit
  - Alamat
  - Kontak

---

### 📌 Menu Transaksi

#### 🔹 Peminjaman
- Memilih anggota dan buku
- Mengatur tanggal pinjam dan tenggat
- Otomatis mengurangi stok buku
- Validasi data sebelum disimpan

#### 🔹 Pengembalian
- Mencatat tanggal pengembalian
- Menghitung hari keterlambatan
- Stok buku otomatis bertambah setelah dikembalikan

---

## 🧪 Testing dan Troubleshooting

Jika aplikasi tidak dapat terhubung ke database:
- Pastikan Laragon sudah jalan
- Pastikan `db_library` sudah terimport
- Periksa file `Koneksi.java`:
  ```java
  String url = "jdbc:mysql://localhost:3306/db_library";
  String user = "root";
  String pass = "";
  ```

---

## ✅ Selesai!
Sekarang aplikasi Libralystic sudah siap digunakan untuk mengelola perpustakaan Anda. Jangan lupa untuk selalu backup database secara berkala untuk menghindari kehilangan data.

---
