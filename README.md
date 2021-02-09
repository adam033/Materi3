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

