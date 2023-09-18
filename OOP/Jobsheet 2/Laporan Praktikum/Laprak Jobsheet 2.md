# LAPORAN PRAKTIKUM PBO

# Jobsheet 2 - Class dan Object

Nama : Fatriya Ibnu Ash shidiqqi

NIM : 2241720138

Kelas : TI 2F

## Percobaan 1 - Membuat Class Diagram

Studi Kasus 1:
Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya.

1. Gambarkan desain class diagram dari studi kasus 1!
   <img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\Prak1 [MConverter.eu].png">
2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!
   -Karyawan
3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!
   - ID (string)
   - Nama(String)
   - Jabatan (String)
   - Gaji (Integer)
4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!
   - tampilData
   - tampilGaji

## Percobaan 2 - Membuat dan mengakses anggota suatu class

Class Mahasiswa

public class Mahasiswa {
public int nim;
public String nama;
public String alamat;
public String kelas;

    public void tampilBiodata() {
        System.out.println("Nim    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kelas  : " + kelas);
    }

}

Class TestMahasiswa
public class TestMahasiswa {
public static void main(String[] args) {
Mahasiswa mhs1 = new Mahasiswa();
Mahasiswa mhs2 = new Mahasiswa();
Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
    }

}

Output Mahasiswa
<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\OutputMahasiswa.png">

## Pertanyaan

7.  Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!
    - Proses pendeklarasian atribut terjadi pada bagian baris kedua sampai kelima dimana atribut yang dideklarasikan adalah nama, nim, Alamat, dan kelas
8.  Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!
    - Pada baris keempat dimana methodnya adalah tampilBiodata
9.  Berapa banyak objek yang di instansiasi pada program diatas!
    - Satu objek
10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?
    - Mengisi atribut nim dari objek mhs.1
11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?
    - Memanggil method untuk menampilkan biodata dari objek mhs1
12. Instansiasi 2 objek lagi pada program diatas! - Kode Program

        public class TestMahasiswa {
        public static void main(String[] args) {
            Mahasiswa mhs1 = new Mahasiswa();
            Mahasiswa mhs2 = new Mahasiswa();
            Mahasiswa mhs3 = new Mahasiswa();

            mhs1.nim = 101;
            mhs1.nama = "Lestari";
            mhs1.alamat = "Jl. Vinolia No 1A";
            mhs1.kelas = "1A";
            mhs1.tampilBiodata();

            mhs2.nim = 102;
            mhs2.nama = "Joan";
            mhs2.alamat = "Jl. Melati No 1A";
            mhs2.kelas = "1A";
            mhs2.tampilBiodata();

            mhs3.nim = 103;
            mhs3.nama = "Rudi";
            mhs3.alamat = "Jl. Jawa No 1A";
            mhs3.kelas = "1A";
            mhs3.tampilBiodata();

        }

    }

Output
<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\prak1_output.png">

## Percobaan 3 - Menulis method yang memiliki argument/parameter dan memiliki return

Kode Program
Class Barang

public class Barang {
public String namaBrg;
public String jenisBrg;
public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang    : " + namaBrg);
        System.out.println("Jenis Barang   : " + jenisBrg);
        System.out.println("Stok           : " + stok);
    }

    // method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }

}

    Class TestBarang
    public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        System.out.println("Stok Baru adalah " + brg1.tambahStok(20));
    }

}

Output
<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\prak2_output.png">

## Tugas

### Tugas No 1

1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class diagram pada studi kasus diatas!
   Penjelasan:
   • Harga yang harus dibayar diperoleh dari lama sewa x harga.
   • Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.

<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\Tugas1 [MConverter.eu].png">

2.  Buatlah program dari class diagram yang sudah anda buat di no 1!

        Kode Program
        Class Persewaan

        public class Persewaan {
        public String id, namaMember, namaGame;
        public int harga, lama;

        public void tampilData() {
            System.out.println(" ID Peminjaman: " + id);
            System.out.println(" Nama Member: " + namaMember);
            System.out.println(" Nama Game: " + namaGame);
            System.out.println(" Lama Sewa: " + lama + " hari");
            System.out.println(" Total Harga: " + totalHarga() + " Rupiah");
        }

        public int totalHarga() {
            return harga * lama;
        }

    }

Class PersewaanMain

public class PersewaanMain {
public static void main(String[] args) {
Persewaan psw = new Persewaan();
psw.id = "112256";
psw.namaMember = "Andy";
psw.namaGame = "FIFA 23";
psw.harga = 10000;
psw.lama = 3;
psw.tampilData();
}
}

3. Buatlah program sesuai dengan class diagram berikut ini:
   <img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\classDiagramno3.jpg">

Kode Program
Class Lingkaran

public class Lingkaran {
double phi = 3.14;
double r;

    public double hitungLuas() {
        return r * r * phi;
    }

    public double hitungKeliling() {
        return r * 2 * phi;
    }

}

Class LingkaranMain

import java.util.Scanner;
public class LingkaranMain {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = scanner.nextDouble();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = r;

        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);

    }

}

Output
<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\output_tugasno3.png">

4. Buatlah program sesuai dengan class diagram berikut ini:
   <img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\classDiagramno4.jpg">
   Deskripsi / Penjelasan :
   • Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %
   • Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini:
   harga jual = harga dasar – (diskon x harga dasar)
   • Method tampilData() digunakan untuk menampilkan nilai dari kode, namaBarang, hargaDasar, diskon dan harga jual.
   Kode Program
   Class Barang

public class Barang {
private String kode, namaBarang;
private int hargaDasar;
private float diskon;

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaDasar(int hargaDasar) {
        this.hargaDasar = hargaDasar;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public void tampilData() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kode Barang : " + kode);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon);
        System.out.print("Total Harga: " + hitungHargaJual());
    }

    public int hitungHargaJual() {
        return hargaDasar - (int) (hargaDasar * diskon / 100);
    }

}

Class BarangMain

public class BarangMain {
public static void main(String[] args) {
Barang brg = new Barang();
brg.setNamaBarang("Tas");
brg.setKode("ATK3725");
brg.setHargaDasar(75000);
brg.setDiskon(30);
brg.tampilData();
}
}

Output
<img src="C:\Users\Diki\Documents\Polinema\SEM 3\OOP\Jobsheet 2\img\Output tugasno4.png">
