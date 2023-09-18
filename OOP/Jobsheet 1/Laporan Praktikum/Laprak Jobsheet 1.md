# LAPORAN PRAKTIKUM PBO

# Jobsheet 1 - Pengantar Konsep Pemrograman Berorientasi Objek

Nama : Fatriya Ibnu Ash shidiqqi

NIM : 2241720138

Kelas : TI 2F

## Percobaan 1

Class Sepeda

    public class Sepeda {
        private String merek;
        private int kecepatan;
        private int gear;

        public void setMerek(String newValue) {
            merek = newValue;
        }

        public void gantiGear(int newValue) {
            gear = newValue;
        }

        public void tambahKecepatan(int increment) {
            kecepatan = kecepatan + increment;
        }

        public void rem(int decrement) {
            kecepatan = kecepatan - decrement;
        }

        public void cetakStatus() {
            System.out.println("Merek: " + merek);
            System.out.println("Kecepatan: " + kecepatan);
            System.out.println("Gear: " + gear);
        }

    }

Class SepedaDemo

    public class SepedaDemo {
        public static void main(String[] args) {
            // Buat dua buah objek sepeda
            Sepeda spd1 = new Sepeda();
            Sepeda spd2 = new Sepeda();

            // Panggil method didalam objek sepeda
            spd1.setMerek("Polygone");
            spd1.tambahKecepatan(10);
            spd1.gantiGear(2);
            spd1.cetakStatus();

            spd2.setMerek("Wim Cycle");
            spd2.tambahKecepatan(10);
            spd2.gantiGear(2);
            spd2.tambahKecepatan(10);
            spd2.gantiGear(3);
            spd2.cetakStatus();
        }
    }

## Percobaan 2

Class SepedaGunung

    package sepedaDemo;

    public class SepedaGunung extends Sepeda {

        private String tipeSuspensi;

        public void setTipeSuspensi(String newValue) {
            tipeSuspensi = newValue;
        }

        public void cetakStatus() {
            super.cetakStatus();
            System.out.println("Tipe suspensi: " + tipeSuspensi);
        }

    }

Class SepedaDemo

    package sepedaDemo;

    public class SepedaDemo {
        public static void main(String[] args) {
            // Buat dua buah objek sepeda
            Sepeda spd1 = new Sepeda();
            Sepeda spd2 = new Sepeda();
            SepedaGunung spd3 = new SepedaGunung();

            // Panggil method didalam objek sepeda
            spd1.setMerek("Polygone");
            spd1.tambahKecepatan(10);
            spd1.gantiGear(2);
            spd1.cetakStatus();

            spd2.setMerek("Wiim Cycle");
            spd2.tambahKecepatan(10);
            spd2.gantiGear(2);
            spd2.tambahKecepatan(10);
            spd2.gantiGear(3);
            spd2.cetakStatus();

            spd3.setMerek("Klinee");
            spd3.tambahKecepatan(5);
            spd3.gantiGear(7);
            spd3.setTipeSuspensi("Gas suspension");
            spd3.cetakStatus();
        }
    }

Output Sepeda

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/Picture5.png">

## Pertanyaan

1. Jelaskan perbedaan antara objek dengan class! Jawaban:
   ➢ Objek adalah bentuk instance atau wujud dari sebuah class
   ➢ Class adalah konsep atau blueprint dari suatu objek
2. Jelaskan alasan warna dan tipe mesin dapat menjadi atribut dari objek mobil! Jawaban:
   - Karena warna dan tipe mesin merupakan informasi dari mobil.
3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural! Jawaban:
   - Dengan PBO program lebih fleksibel dan modular, sehingga ketika terdapat perubahan fitur tidak akan mempengaruhi keseluruhan program.
4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti “public String nama,alamat;”? Jawaban:
   - Boleh dengan syarat variabel memiliki tipe data yang sama.
5. Pada class SepedaGunung, jelaskan alasan atribut merk, kecepatan, dan gear tidak lagi ditulis di dalam class tersebut! Jawaban:
   ➢ Karena class SepedaGunung merupakan extends/ warisan dari class Sepeda

## Tugas

### Objek 1 : Laptop

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/GambarLaptop.png">

Class Laptop

public class Laptop {
private String merek, cpu;
private int ram;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setRam(int newValue) {
        ram = newValue;
    }

    public void setCpu(String newValue) {
        cpu = newValue;
    }

    public void print() {
        System.out.println("Merek laptop: " + merek);
        System.out.println("Kapasitas RAM: " + ram + " GB");
        System.out.println("Processor Laptop: " + cpu);
    }

    public static void main(String[] args) {
        Laptop lt = new Laptop();
        lt.setMerek("HP");
        lt.setRam(8);
        lt.setCpu("Intel core i5");
        lt.print();
    }

}

Output Laptop

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/SS%20Laptop.png">

### Objek 2 : Lampu

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/GambarLampu.png">

Class Lampu

public class Lampu {
private String merek, jenis;
private int daya;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setJenis(String newValue) {
        jenis = newValue;
    }

    public void setDaya(int newValue) {
        daya = newValue;
    }

    public void print() {
        System.out.println("Merek lampu: " + merek);
        System.out.println("Daya Lampu: " + daya + " watt");
        System.out.println("Jenis Lampu: " + jenis);
    }

    public static void main(String[] args) {
        Lampu lmp = new Lampu();
        lmp.setMerek("Phillips");
        lmp.setJenis("LED");
        lmp.setDaya(20);
        lmp.print();
    }

}

Output Lampu

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/SS%20Lampu.png">

### Objek 3 dan 4 (Objek Turunan) : Motor dan Motor Listrik

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/GambarMotor.png">
<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/GambarMotorListrik.jpg">

Class Motor

public class Motor {
private String merek;
private int kecepatan;
private String cc;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setCc(String newValue) {
        cc = newValue;
    }

    public void gas(int tambah) {
        kecepatan = kecepatan + tambah;
    }

    public void rem(int kurang) {
        kecepatan = kecepatan - kurang;
    }

    public void printMotor() {
        System.out.println("Merek motor: " + merek);
        System.out.println("Kecepatan motor: " + kecepatan);
        System.out.println("cc motor: " + cc);
    }

}

Class MotorListrik

public class MotorListrik extends Motor {
private String kapasitasBaterai;
private int baterai;
private boolean casBaterai;

    public void setkapasitasBaterai(String newValue) {
        kapasitasBaterai = newValue;
    }

    public void setBaterai(int newValue) {
        baterai = newValue;
    }

    public void casBaterai(boolean cas) {
        casBaterai = cas;
        if (casBaterai) {
            baterai = 100;
        }
    }

    public void printMotor() {
        super.printMotor();
        System.out.println("Kapasitas baterai: " + kapasitasBaterai);
        System.out.println("Baterai saat ini: " + baterai);
    }

}

Class MotorManual
public class MotorManual extends Motor {
private int gear;

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void printMotor() {
        super.printMotor();
        System.out.println("Gear: " + gear);
    }

}

Class MotorMain

public class MotorMain {
public static void main(String[] args) {

        MotorManual mtr1 = new MotorManual();
        Motor mtr2 = new Motor();
        MotorListrik mtr3 = new MotorListrik();

        mtr1.setMerek("Supra X");
        mtr1.setCc("125 CC");
        mtr1.gas(40);
        mtr1.gantiGear(2);
        mtr1.printMotor();

        mtr2.setMerek("Beat");
        mtr2.setCc("110 CC");
        mtr2.gas(40);
        mtr2.rem(10);
        mtr2.printMotor();

        mtr3.setMerek("Viar");
        mtr3.setCc("110 CC");
        mtr3.gas(40);
        mtr3.setkapasitasBaterai("2000 mAh");
        mtr3.setBaterai(50);
        mtr3.casBaterai(false);
        mtr3.printMotor();

    }

}

Output Motor

<img src="https://github.com/polinema-mobile/tugas-praktikum-teori-pertama-ashdiqqi/blob/main/Images/SS%20Motor.png">
