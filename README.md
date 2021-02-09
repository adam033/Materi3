# Relative Layout
Intent adalah mekanisme untuk melakukan sebuah action dan komunikasi antar
komponen aplikasi misal activity, services, dan broadcast receiver. Ada tiga penggunaan umum
intent dalam aplikasi Android yaitu:
1.  Memindahkan satu activity ke activity lain dengan atau tidak membawa data.
2.  Menjalankan background service, misalnya melakukan sinkronisasi ke server dan
menjalankan proses berulang (periodic/scheduler task).
3.  Mengirimkan obyek broadcast ke aplikasi yang membutuhkan. Misal, ketika aplikasi
membutuhkan proses menjalankan sebuah background service setiap kali aplikasi selesai
melakukan booting. Aplikasi harus bisa menerima obyek broadcast yang dikirimkan oleh
sistem Android untuk event booting tersebut.

### Hasil Run :
![Alt Text](https://github.com/adam033/Materi3/blob/main/Screenshot%20(602).png)
![Alt Text](https://github.com/adam033/Materi3/blob/main/Screenshot%20(603).png)

### Jawaban Soal :
Perbedaan LinearLayout,RelativeLayout dan ConstrainLayout :
1.  LinearLayout : Linear Layout adalah jenis layout dimana user menempatkan 1 objek per baris atau kolom secara sejajar. Jadi di dalam setiap baris atau kolom hanya ada 1 objek yang bisa ditempatkan . Linear Layout ini ada dua jenis (Horizontal dan Vertikal).
2.  RelativeLayout : Relative Layout adalah jenis layout yang memiliki karakteristik dalam menempatkan view secara relatif (Baca apa itu relatif disini). Relatif disini berarti posisi dari setiap view bergantung kepada view yang lain. Simplenya adalah, kita bebas untuk menempatkan objek yang diinginkan sesuka hati kita. Penempatan satu objek bisa dimana saja mau di sisi kanan, kiri, atas, ataupun bawah dari objek lain. Jika tidak di tetapkan, maka objek dapat menumpuk antara satu objek dengan objek yang lain. (Lebih simpelnya lebih fleksibel menggunakan Relative layout daripada Linear layout).

