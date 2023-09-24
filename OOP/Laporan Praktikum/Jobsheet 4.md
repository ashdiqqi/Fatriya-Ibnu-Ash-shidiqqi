**LAPORAN PRAKTIKUM**

**PEMROGRAMAN BERBASI OBJEK**

**JOBSHEET 4**

<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 4\IMG\Aspose.Words.59584862-5317-48f0-80e4-1225e8b9f2de.001.png">

OLEH :

FATRIYA IBNU ASH SHIDIQQI

2241720138

TI-2F

PROGRAM STUDI D-IV TEKNIK INFORMATIKA

JURUSAN TEKNOLOGI INFORMASI

POLITEKNIK NEGERI MALANG

Jl. Soekarno Hatta No.9, Jatimulyo, Kec. Lowokwaru, Kota Malang, Jawa Timur 65141

Percobaan 1

Kode Program Laptop.java

public class Laptop {

`    `private String merk;

      private Processor proc;

`    `public Laptop() {

`    `}

`    `public Laptop(String merk, Processor proc) {

`        `this.merk = merk;

`        `this.proc = proc;

`    `}

`    `public String getMerk() {

`        `return merk;

`    `}

`    `public void setMerk(String merk) {

`        `this.merk = merk;

`    `}

`    `public Processor getProc() {

`        `return proc;

`    `}

`    `public void setProc(Processor proc) {

`        `this.proc = proc;

`    `}

`    `public void info() {

`        `System.out.println("Merk Laptop = " + merk);

`        `proc.info();

`    `}

}

Kode Program Processor

public class Laptop {

`    `private String merk;

`    `private Processor proc;

`    `public Laptop() {

`    `}

`    `public Laptop(String merk, Processor proc) {

`        `this.merk = merk;

`        `this.proc = proc;

`    `}

`    `public String getMerk() {

`        `return merk;

`    `}

`    `public void setMerk(String merk) {

`        `this.merk = merk;

`    `}

`    `public Processor getProc() {

`        `return proc;

`    `}

`    `public void setProc(Processor proc) {

`        `this.proc = proc;

`    `}

`    `public void info() {

`        `System.out.println("Merk Laptop = " + merk);

`        `proc.info();

`    `}

}

Kode Program MainPercobaan1.java

public class MainPercobaan1 {

`    `public static void main(String[] args) {

`        `Processor p = new Processor("Intel i5", 3);

`        `Laptop L = new Laptop("Thinkpad", p);

`        `Processor p1 = new Processor();

`        `p1.setMerk("Intel i5");

`        `p1.setCache(4);

`        `Laptop L1 = new Laptop();

`        `L1.setMerk("Thinkpad");

`        `L1.setProc(p1);

`        `L1.info();

`        `L.info();

`    `}

}

Output

<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 4\IMG\Aspose.Words.59584862-5317-48f0-80e4-1225e8b9f2de.002.png">
Pertanyaan

1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk

masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?

- **Method setter dan getter berguna untuk memberikan akses terhadap suatu atribut pada class tertentu agar dapat diakses di class lainnya**

1. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor

default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?

- **Konstruktor default digunakan Ketika ingin membuat objek dari kelas tanpa memberikan nilai awal khusus.**
- **Konstruktor berparameter menginisialisasi objek dengan nilai-nilai yang disediakan saat pembuatan objek.**

1. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?

- **Merk**

1. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ?

- `    `**private Processor proc;**

1. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?

- **Untuk mencetak nilai merk dan cache processor**

1. Pada class MainPercobaan1, terdapat baris kode: Laptop l = new Laptop("Thinkpad", p);. Apakah p tersebut ?

Dan apakah yang terjadi jika baris kode tersebut diubah menjadi Page 4 of 10

Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));

Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?

- **Hasil program tetap sama, yaitu kedua objek Laptop (L dan L1) akan memiliki merk "Thinkpad" dan objek Processor yang merknya "Intel i5" dengan cache 3.**

Percobaan 2

Kode Program Pelaanggan.java

public class Pelanggan {

`    `private String nama;

`    `private Mobil mobil;

`    `private Sopir sopir;

`    `private int hari;

`    `public Pelanggan() {

`    `}

`    `public void setMobil(Mobil mobil) {

`        `this.mobil = mobil;

`    `}

`    `public Mobil getMobil() {

`        `return mobil;

`    `}

`    `public void setNama(String nama) {

`        `this.nama = nama;

`    `}

`    `public String getNama() {

`        `return nama;

`    `}

`    `public void setHari(int hari) {

`        `this.hari = hari;

`    `}

`    `public int getHari() {

`        `return hari;

`    `}

`    `public void setSopir(Sopir sopir) {

`        `this.sopir = sopir;

`    `}

`    `public Sopir getSopir() {

`        `return sopir;

`    `}

`    `public int hitungBiayaTotal() {

`        `return mobil.hitungBiayaMobil(hari) +

`                `sopir.hitungBiayaSopir(hari);

`    `}

}

Kode Program Sopir.java

public class Sopir {

`    `private String nama;

`    `private int biaya;

`    `public void setNama(String nama) {

`        `this.nama = nama;

`    `}

`    `public void setBiaya(int biaya) {

`        `this.biaya = biaya;

`    `}

`    `public String getNama() {

`        `return nama;

`    `}

`    `public int getBiaya() {

`        `return biaya;

`    `}

`    `public int hitungBiayaSopir(int hari) {

`        `return biaya \* hari;

`    `}

}

Kode Program Mobil.java

public class Mobil {

`    `private String merk;

`    `private int biaya;

`    `public Mobil() {

`    `}

`    `public void setMerk(String merk) {

`        `this.merk = merk;

`    `}

`    `public void setBiaya(int biaya) {

`        `this.biaya = biaya;

`    `}

`    `public String getMerk() {

`        `return merk;

`    `}

`    `public int getBiaya() {

`        `return biaya;

`    `}

`    `public int hitungBiayaMobil(int hari) {

`        `return biaya \* hari;

`    `}

}

Kode Program MainPercobaan2.java

public class MainPercobaan2 {

`    `public static void main(String[] args) {

`        `Mobil m = new Mobil();

`        `m.setMerk("Avanza");

`        `m.setBiaya(350000);

`        `Sopir s = new Sopir();

`        `s.setNama("John Doe");

`        `s.setBiaya(200000);

`        `Pelanggan p = new Pelanggan();

`        `p.setNama("Jane Doe");

`        `p.setMobil(m);

`        `p.setSopir(s);

`        `p.setHari(2);

`        `System.out.println("Biaya Total = " + p.hitungBiayaTotal());

`    `}

}

Output

<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 4\IMG\Aspose.Words.59584862-5317-48f0-80e4-1225e8b9f2de.003.png">
Pertanyaan

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?

- **private Mobil mobil;**
- **private Sopir sopir;**

1. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ?

- **Karena perhitungan biayanya dihitung berdasarkan jumlah hari jadi dibutuhkan argument hari agar perhitungan dapat dilakukan**

1. Perhatikan kode dari class Pelanggan. Untuk apakah perintah <a name="_hlk146395867"></a>mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?

- **Fungsi mobil.hitungBiayaMobil(hari) untuk memanggil fungsi hitungBiayaMobil pada class Mobil.**
- **Fungsi mobil.hitungBiayaSopir(hari) untuk memanggil fungsi hitungBiayaSopirpada class Sopir.**

1. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ?

- Sintaks p.setMobil(m) untuk mengisi atribut mobil pada class pelanggan dengan mobil “Avanza”
- Sintaks p.setSopir(s) untuk mengisi atribut sopir pada class pelanggan dengan nama “Jane Doe”

1. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ?

- Untuk menghitung total biaya mobil dan sopir

1. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run! Page 6 of 10 System.out.println(p.getMobil().getMerk()); Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut?

- **Sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut digunakan untuk mengakses merk mobil yang dimiliki oleh objek Pelanggan yang telah dibuat sebelumnya.**

Percobaan 3

Kode Program Pegawai

public class Pegawai {

`    `private String nip;

`    `private String nama;

`    `public Pegawai(String nip, String nama) {

`        `this.nip = nip;

`        `this.nama = nama;

`    `}

`    `public String getNip() {

`        `return nip;

`    `}

`    `public void setNip(String nip) {

`        `this.nip = nip;

`    `}

`    `public String getNama() {

`        `return nama;

`    `}

`    `public void setNama(String nama) {

`        `this.nama = nama;

`    `}

`    `public String info() {

`        `String info = "";

`        `info += "Nip: " + this.nip + "\n";

`        `info += "Nama: " + this.nama + "\n";

`        `return info;

`    `}

}

KeretaApi.java

public class KeretaApi {

`    `private String nama;

`    `private String kelas;

`    `private Pegawai masinis;

`    `private Pegawai asisten;

`    `public KeretaApi(String nama, String kelas, Pegawai masinis) {

`        `this.nama = nama;

`        `this.kelas = kelas;

`        `this.masinis = masinis;

`    `}

`    `public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {

`        `this.nama = nama;

`        `this.kelas = kelas;

`        `this.masinis = masinis;

`        `this.asisten = asisten;

`    `}

`    `public String getNama() {

`        `return nama;

`    `}

`    `public void setNama(String nama) {

`        `this.nama = nama;

`    `}

`    `public String getKelas() {

`        `return kelas;

`    `}

`    `public void setKelas(String kelas) {

`        `this.kelas = kelas;

`    `}

`    `public Pegawai getMasinis() {

`        `return masinis;

`    `}

`    `public void setMasinis(Pegawai masinis) {

`        `this.masinis = masinis;

`    `}

`    `public Pegawai getAsisten() {

`        `return asisten;

`    `}

`    `public void setAsisten(Pegawai asisten) {

`        `this.asisten = asisten;

`    `}

`    `public String info() {

`        `String info = "";

`        `info += "Nama: " + this.nama + "\n";

`        `info += "Kelas: " + this.kelas + "\n";

`        `info += "Masinis: " + this.masinis.info() + "\n";

`        `if (this.asisten != null) {

`            `info += "Asisten: " + this.asisten.info() + "\n";

`        `}

`        `return info;

`    `}

}

MainPerccobaan3.java

public class MainPercobaan3 {

`    `public static void main(String[] args) {

`        `Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");

`        `Pegawai asisten = new Pegawai("4567", "Patrick Star");

`        `KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

`        `System.out.println(keretaApi.info());

`    `}

}

Output

<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 4\IMG\Aspose.Words.59584862-5317-48f0-80e4-1225e8b9f2de.004.png">

Pertanyaan

1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa

- **Pada method info() dalam class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk mengambil informasi atau data tentang objek Pegawai yang menjadi masinis dan asisten pada kereta api. Ini digunakan untuk menyusun informasi tentang kereta api, termasuk data masinis dan asisten jika ada.**

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang

sama. Tambahkan kode berikut pada method main() !

Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");

KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

System.out.println(keretaApi.info());

package pertemuan4.relasiClassPercobaan3;

public class MainPertanyaan {

`    `public static void main(String[] args) {

`        `Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");

`        `KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

`        `System.out.println(keretaApi.info());

`    `}

}

3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?

- <img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 4\IMG\Aspose.Words.59584862-5317-48f0-80e4-1225e8b9f2de.005.png">

4. Perbaiki class KeretaApi sehingga program dapat berjalan !

Percobaan 4

Kode Program

Gerbong.java

public class Gerbong {

`    `private String kode;

`    `private Kursi[] arrayKursi;

`    `private void initKursi() {

`        `for (int i = 0; i < arrayKursi.length; i++) {

`            `this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));

`        `}

`    `}

`    `public Gerbong(String kode, int jumlah) {

`        `this.kode = kode;

`        `this.arrayKursi = new Kursi[jumlah];

`        `this.initKursi();

`    `}

`    `public String info() {

`        `String info = "";

`        `info += "Kode: " + kode + "\n";

`        `for (Kursi kursi : arrayKursi) {

`            `info += kursi.info();

`        `}

`        `return info;

`    `}

`    `public void setPenumpang(Penumpang penumpang, int nomor) {

`        `this.arrayKursi[nomor - 1].setPenumpang(penumpang);

`        `}

}

Penumpang.java

public class Penumpang {

`    `private String ktp;

`    `private String nama;

`    `public Penumpang(String ktp, String nama) {

`        `this.ktp = ktp;

`        `this.nama = nama;

`    `}

`    `public String getKtp() {

`        `return ktp;

`    `}

`    `public void setKtp(String ktp) {

`        `this.ktp = ktp;

`    `}

`    `public String getNama() {

`        `return nama;

`    `}

`    `public void setNama(String nama) {

`        `this.nama = nama;

`    `}

`    `public String info() {

`        `String info = "";

`        `info += "Ktp: " + ktp + "\n";

`        `info += "Nama: " + nama + "\n";

`        `return info;

`    `}

}

Kursi.java

public class Kursi {

`    `private String nomor;

`    `private Penumpang penumpang;

`    `public Kursi(String nomor) {

`        `this.nomor = nomor;

`    `}

`    `public String getNomor() {

`        `return nomor;

`    `}

`    `public void setNomor(String nomor) {

`        `this.nomor = nomor;

`    `}

`    `public Penumpang getPenumpang() {

`        `return penumpang;

`    `}

`    `public void setPenumpang(Penumpang penumpang) {

`        `this.penumpang = penumpang;

`    `}

`    `public String info() {

`        `String info = "";

`        `info += "Nomor: " + nomor + "\n";

`        `if (this.penumpang != null) {

`            `info += "Penumpang: " + penumpang.info() + "\n";

`        `}

`        `return info;

`    `}

}

MainPercobaan4.java

public class MainPercobaan4 {

`    `public static void main(String[] args) {

`        `Penumpang p = new Penumpang("12345", "Mr. Krab");

`        `Penumpang p1 = new Penumpang("12346", "Budi");

`        `Gerbong gerbong = new Gerbong("A", 10);

`        `gerbong.setPenumpang(p, 1);

`        `gerbong.setPenumpang(p1, 1);

`        `System.out.println(gerbong.info());

`    `}

}

Output

<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 4\IMG\Aspose.Words.59584862-5317-48f0-80e4-1225e8b9f2de.006.png">

Pertanyaan

1\. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?

- **10 Kursi**

2\. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode

tersebut ?

...

if (this.penumpang != null) {

info += "Penumpang: " + penumpang.info() + "\n";

}

...

- **Potongan kode tersebut digunakan untuk memeriksa apakah objek penumpang dalam kursi tersebut tidak null. Jika objek penumpang tidak null, maka informasi tentang penumpang tersebut akan ditambahkan ke dalam string info.**

3\. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi

dengan angka 1 ?

- Karena method tersebut menggunakan array sehingga pengurangan nilai nomor dengan angka 1 dilakukan untuk menyesuaikan dengan indeks kursi dalam array kursi karena indeks pada array dimulai dari 0.

4\. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ?

- Objek baru menempati kursi yang sama dengan objek yang telah ada sebelumnya

1. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain !

public void setPenumpang(Penumpang penumpang, int nomor) {

`        `Kursi kursi = this.arrayKursi[nomor - 1];

`        `if (kursi.getPenumpang() == null) {

`            `kursi.setPenumpang(penumpang);

`        `} else {

`            `System.out.println("Kursi nomor " + nomor + " sudah terisi oleh penumpang lain.");

`        `}

`    `}
