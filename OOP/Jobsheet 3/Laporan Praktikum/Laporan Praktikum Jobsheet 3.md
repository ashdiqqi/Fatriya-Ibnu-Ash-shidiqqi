**LAPORAN PRAKTIKUM**

**PEMROGRAMAN BERBASIS OBJEK**

**JOBSHEET 3**

**Mata Kuliah Praktikum Pemrograman Berbasis Objek**

![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image1.png){width="3.553472222222222in"
height="3.5805555555555557in"}

**Oleh :**

**Fatriya Ibnu Ash shidiqqi (13)**

**TI 2F**

**2241720138**

**PRODI TEKNIK INFORMATIKA**

**JURUSAN TEKNOLOGI INFORMASI**

**POLITEKNIK NEGERI MALANG**

**2023**

-   Percobaan 1 - Enkapsulasi

Kode Program

public class Motor {

    private int kecepatan = 0;

    private boolean kontakOn = false;

public void printStatus() {

        if (kontakOn == true) {

            System.out.println(\"Kontak On\");

        } else {

            System.out.println(\"Kontak Off\");

        }

        System.out.println(\"Kecepatan \" + kecepatan + \"\\n\");

    }

}

public class MotorDemo {

    public static void main(String\[\] args) {

        Motor motor = new Motor();

        motor.printStatus();

        motor.kecepatan = 50;

        motor.printStatus();

    }

}

-   Percobaan 2 Access Modifier

public class Motor {

    private int kecepatan = 0;

    private boolean kontakOn = false;

    public void nyalakanMesin() {

        kontakOn = true;

    }

    public void matikanMesin() {

        kontakOn = false;

        kecepatan = 0;

    }

    public void tambahKecepatan() {

        if (kontakOn == true) {

                kecepatan += 50;

        } else {

            System.out.println(\"Kecepatan tidak bisa bertambah karena
Mesin Off !\\n\");

        }

    public void kurangiKecepatan() {

        if (kontakOn == true) {

            kecepatan -= 5;

        } else {

            System.out.println(\"Kecepatan tidak bisa berkurang karena
Mesin Off !\\n\");

        }

    }

    public void printStatus() {

        if (kontakOn == true) {

            System.out.println(\"Kontak On\");

        } else {

            System.out.println(\"Kontak Off\");

        }

        System.out.println(\"Kecepatan \" + kecepatan + \"\\n\");

    }

}

public class MotorDemo {

    public static void main(String\[\] args) {

        Motor motor = new Motor();

        motor.printStatus();

        motor.tambahKecepatan();

        motor.nyalakanMesin();

        motor.printStatus();

        motor.tambahKecepatan();

        motor.printStatus();

        motor.tambahKecepatan();

        motor.printStatus();

        motor.tambahKecepatan();

        motor.printStatus();

        motor.matikanMesin();

        motor.printStatus();

    }

}

> Pertanyaan

1.  Pada class TestMobil, saat kita menambah kecepatan untuk pertama
    kalinya, mengapa

> muncul peringatan "Kecepatan tidak bisa bertambah karena Mesin Off!"?

-   Karena pada method tambahKecepatan terdapat sintaks bahwa method ini
    hanya bisa dilakukan jika kontakOn == true

    1.  Mengapat atribut kecepatan dan kontakOn diset private?

-   Agar atribut tersebut tidak dapat diakses sembarangan kecuali
    menggunakan getter dan setter

    1.  Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

3.  public class Motor {

4.      private int kecepatan = 0;

5.      private boolean kontakOn = false;

6.      private int maks = 100;

7.  

8.      public void nyalakanMesin() {

9.          kontakOn = true;

10.     }

11. 

12.     public void matikanMesin() {

13.         kontakOn = false;

14.         kecepatan = 0;

15.     }

16. 

17.     public void tambahKecepatan() {

18.         if (kontakOn == true) {

19.             if (kecepatan + 50 \<= maks) {

20.                 kecepatan += 50;

21.             } else {

22.                 System.out.println(\"Kecepatan sudah maksimal\");

23.                 kecepatan = maks;

24.             }

25.         } else {

26.             System.out.println(\"Kecepatan tidak bisa bertambah
    karena Mesin Off !\\n\");

27.         }

28.     }

29. 

30.     public void kurangiKecepatan() {

31.         if (kontakOn == true) {

32.             kecepatan -= 5;

33.         } else {

34.             System.out.println(\"Kecepatan tidak bisa berkurang
    karena Mesin Off !\\n\");

35.         }

36.     }

37. 

38.     public void printStatus() {

39.         if (kontakOn == true) {

40.             System.out.println(\"Kontak On\");

41.         } else {

42.             System.out.println(\"Kontak Off\");

43.         }

44.         System.out.println(\"Kecepatan \" + kecepatan + \"\\n\");

45.     }

46. }

-   Percobaan 3 Getter dan Setter

Kode Program :

public class Anggota {

    private String nama;

    private String alamat;

    private float simpanan;

  public void setNama(String nama) {

        this.nama = nama;

    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;

    }

    public String getNama() {

        return nama;

    }

    public String getAlamat() {

        return alamat;

    }

    public float getSimpanan() {

        return simpanan;

    }

    public void setor(float uang) {

        simpanan += uang;

    }

    public void pinjam(float uang) {

        simpanan -= uang;

    }

}

public class KoperasiDemo {

    public static void main(String\[\] args) {

Anggota anggota1 = new Anggota(\"Iwan\", \"Jalan Mawar\");

anggota1.setNama(\"Iwan Setiawan\");

        anggota1.setAlamat(\"Jalan Sukarno Hatta no 18\");

        anggota1.setor(100000);

        System.out.println(\"Simpanan \" + anggota1.getNama() + \" : Rp
\" + anggota1.getSimpanan());

        anggota1.pinjam(5000);

        System.out.println(\"Simpanan \" + anggota1.getNama() + \" : Rp
\" + anggota1.getSimpanan());

    }

}

-   Percobaan 4 Konstruktor dan Instansiasi

public class Anggota {

    private String nama;

    private String alamat;

    private float simpanan;

    Anggota(String nama, String alamat) {

        this.nama = nama;

        this.alamat = alamat;

        this.simpanan = 0;

    }

    public void setNama(String nama) {

        this.nama = nama;

    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;

    }

    public String getNama() {

        return nama;

    }

    public String getAlamat() {

        return alamat;

    }

    public float getSimpanan() {

        return simpanan;

    }

    public void setor(float uang) {

        simpanan += uang;

    }

    public void pinjam(float uang) {

        simpanan -= uang;

    }

}

public class KoperasiDemo {

    public static void main(String\[\] args) {

        Anggota anggota1 = new Anggota(\"Iwan\", \"Jalan Mawar\");

        System.out.println(\"Simpanan \" + anggota1.getNama() + \" : Rp
\" + anggota1.getSimpanan());

        anggota1.setNama(\"Iwan Setiawan\");

        anggota1.setAlamat(\"Jalan Sukarno Hatta no 18\");

        anggota1.setor(100000);

        System.out.println(\"Simpanan \" + anggota1.getNama() + \" : Rp
\" + anggota1.getSimpanan());

        anggota1.pinjam(5000);

        System.out.println(\"Simpanan \" + anggota1.getNama() + \" : Rp
\" + anggota1.getSimpanan());

    }

}

1.  ## Pertanyaan -- Percobaan 3 dan 4

    1.  Apa yang dimaksud getter dan setter?

-   Setter adalah function atau method yang dipakai untuk memberikan
    nilai ke dalam sebuah data.

-   Getter adalah function yang dipakai untuk menampilkan nilai dari
    suatu data.

    1.  Apa kegunaan dari method getSimpanan()?

```{=html}
<!-- -->
```
-   Method getSimpanan() berfungsi untuk menampilkan nilai simpanan

    1.  Method apa yang digunakan untk menambah saldo?

-   Method setor(float uang)

    1.  Apa yand dimaksud konstruktor?

-   Konstruktor adalah method yang berfungsi untuk menginisialisasi
    variabel- variabel instans yang akan dimiliki oleh objek.

    1.  Sebutkan aturan dalam membuat konstruktor?

-   Nama konstruktor harus sama dengan nama classnya

-   Menggunakan akses modifier seperti public, private, dan protected

    1.  Apakah boleh konstruktor bertipe private?

```{=html}
<!-- -->
```
-   Boleh, jika bertipe private maka konstruktor tidak dapat diakses
    dari luar kelas tersebut.

    1.  Kapan menggunakan parameter dengan passsing parameter?

-   Saat perlu memberikan nilai atau informasi tambahan kepada metode
    atau konstruktor untuk melakukan tugas tertentu.

    1.  Apa perbedaan atribut class dan instansiasi atribut?

-   Atribut class

```{=html}
<!-- -->
```
-   Atribut kelas adalah atribut yang terkait dengan kelas itu sendiri,
    bukan dengan instance (objek) dari kelas tersebut.

-   Nilai atribut kelas adalah sama untuk semua objek yang dibuat dari
    kelas tersebut karena atribut tersebut terkait dengan kelas itu
    sendiri.

-   Didefinisikan menggunakan kata kunci static di dalam kelas.

-   Diakses menggunakan nama kelas itu sendiri, bukan melalui objek
    individu.

```{=html}
<!-- -->
```
-   Intansiasi atribut

```{=html}
<!-- -->
```
-   Atribut instansiasi adalah atribut yang terkait dengan objek atau
    instance kelas tersebut.

-   Nilai atribut instansiasi berbeda antara satu objek dan objek
    lainnya karena masing-masing objek memiliki salinan atribut
    instansiasi sendiri.

-   Didefinisikan tanpa kata kunci static di dalam kelas.

-   Diakses melalui objek individu yang telah dibuat dari kelas
    tersebut.

    1.  Apa perbedaan class method dan instansiasi method?

```{=html}
<!-- -->
```
-   Class method

```{=html}
<!-- -->
```
-   Terkait dengan kelas itu sendiri, bukan dengan objek individu
    (instance) dari kelas tersebut.

-   Dideklarasikan dengan kata kunci static.

-   Tidak dapat mengakses atribut instansiasi (instance attributes)
    karena tidak ada objek yang berkaitan.

```{=html}
<!-- -->
```
-   Intansiasi method

```{=html}
<!-- -->
```
-   Terkait dengan objek individu (instance) dari kelas tersebut.

-   Tidak menggunakan kata kunci static dalam deklarasinya.

-   Dapat mengakses atribut instansiasi (instance attributes) dan
    bekerja dengan data yang unik untuk setiap objek.

```{=html}
<!-- -->
```
-   Tugas

    1.  Cobalah program dibawah ini dan tuliskan hasil outputnya

> ![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image2.png){width="2.7881944444444446in"
> height="4.915972222222222in"}![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image3.png){width="2.7881944444444446in"
> height="4.915972222222222in"}![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image6.png){width="3.2909722222222224in"
> height="1.7583333333333333in"}![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image7.png){width="3.2909722222222224in"
> height="1.7583333333333333in"}

-   Hasil menampilkan variable name ("James") dan variable age(35)

    1.  Pada program diatas, pada class EncapTest kita mengeset age
        dengan nilai 35, namun pada saat ditampilkan ke layar nilainya
        30, jelaskan mengapa.

-   Karena pada method setAge, terdapat sintaks jika age \> 30 maka age
    akan bernilai 30

    1.  Ubah program diatas agar atribut age dapat diberi nilai maksimal
        30 dan minimal 18.

4.  public class EncapTest {

5.      public static void main(String\[\] args) {

6.          EncapDemo encap = new EncapDemo();

7.          encap.setName(\"James\");

8.          encap.setAge(35);

9.  

10.         System.out.println(\"Name : \" + encap.getName());

11. 

12.         int age = encap.getAge();

13.         if (age == -1) {

14.             System.out.println(\"Usia tidak valid\");

15.         } else {

16.             System.out.println(\"Age : \" + age);

17.         }

18.     }

19. }

public class EncapDemo {

    private String name;

    private int age;

    public String getName() {

        return name;

    }

    public void setName(String newName) {

        name = newName;

    }

     public void setAge(int newAge) {

        age = newAge;

    }

    public int getAge() {

        if (age \>= 18 && age \<= 30) {

            return age;

        } else {

            return -1;

        }

    }

}

Output

![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image10.png){width="2.697283464566929in"
height="0.7517027559055118in"}

4.  Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class
    Anggota yang memiliki atribut antara lain nomor KTP, nama, limit
    peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan
    batas limit peminjaman yang ditentukan. Anggota juga dapat
    mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman,
    maka jumlah pinjaman akan berkurang sesuai dengan nominal yang
    diangsur. Buatlah class Anggota tersebut, berikan atribut, method
    dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi
    berikut ini untuk memeriksa apakah class Anggota yang anda buat
    telah sesuai dengan yang diharapkan.

> ![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image11.png){width="2.6041666666666665in"
> height="2.5381944444444446in"}Hasil yang diharapkan:

public class Anggota {

    private String nik;

    private String nama;

    private double limitPinjaman;

    private double jumlahPinjaman;

    public Anggota(String nik, String nama, double limitPinjaman) {

        this.nik = nik;

        this.nama = nama;

        this.limitPinjaman = limitPinjaman;

        this.jumlahPinjaman = 0;

    }

    public String getNik() {

        return nik;

    }

    public String getNama() {

        return nama;

    }

    public double getLimitPinjaman() {

        return limitPinjaman;

    }

    public double getJumlahPinjaman() {

        return jumlahPinjaman;

    }

    public void pinjam(double jumlah) {

        if (jumlah \<= 0) {

            System.out.println(\"Jumlah pinjaman harus lebih dari 0.\");

        } else if (jumlah + jumlahPinjaman \> limitPinjaman) {

            System.out.println(\"Maaf, Jumlah pinjaman melebihi
limit.\");

        } else {

            jumlahPinjaman += jumlah;

        }

    }

    public void angsur(double jumlah) {

        if (jumlah \<= 0) {

            System.out.println(\"Jumlah angsuran harus lebih dari 0.\");

        } else if (jumlah \> jumlahPinjaman) {

            System.out.println(\"Jumlah angsuran melebihi jumlah
pinjaman.\");

        } else {

            jumlahPinjaman -= jumlah;

        }

    }

}

![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image12.png){width="2.5994192913385827in"
height="2.388655949256343in"}

5.  Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal
    adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang
    dari itu, maka muncul peringatan "Maaf, angsuran harus 10% dari
    jumlah pinjaman".

public class Anggota {

    private String nik;

    private String nama;

    private double limitPinjaman;

    private double jumlahPinjaman;

    public Anggota(String nik, String nama, double limitPinjaman) {

        this.nik = nik;

        this.nama = nama;

        this.limitPinjaman = limitPinjaman;

        this.jumlahPinjaman = 0;

    }

    public String getNik() {

        return nik;

    }

    public String getNama() {

        return nama;

    }

    public double getLimitPinjaman() {

        return limitPinjaman;

    }

    public double getJumlahPinjaman() {

        return jumlahPinjaman;

    }

    public void pinjam(double jumlah) {

        if (jumlah \<= 0) {

            System.out.println(\"Jumlah pinjaman harus lebih dari 0.\");

        } else if (jumlah + jumlahPinjaman \> limitPinjaman) {

            System.out.println(\"Maaf, Jumlah pinjaman melebihi
limit.\");

        } else {

            jumlahPinjaman += jumlah;

        }

    }

    public void angsur(double jumlah) {

        if (jumlah \<= 0) {

            System.out.println(\"Jumlah angsuran harus lebih dari 0.\");

        } else if (jumlah \< (0.1 \* jumlahPinjaman)) {

            System.out.println(\"Maaf, angsuran harus 10% dari jumlah
pinjaman.\");

        } else if (jumlah \> jumlahPinjaman) {

            System.out.println(\"Jumlah angsuran melebihi jumlah
pinjaman.\");

        } else {

            jumlahPinjaman -= jumlah;

        }

    }

}

6.  Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran
    dapat menerima input dari console.

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String\[\] args) {

        Scanner scanner = new Scanner(System.in);

        Anggota donny = new Anggota(\"111333444\", \"Donny\", 5000000);

        System.out.println(\"Nama Anggota: \" + donny.getNama());

        System.out.println(\"Limit Pinjaman: \" +
donny.getLimitPinjaman());

        System.out.println(\"Meminjam uang\");

        System.out.print(\" Masukkan jumlah pinjaman: \");

        double pinjaman = scanner.nextDouble();

        donny.pinjam(pinjaman);

        System.out.println(\"Jumlah pinjaman saat ini: \" +
donny.getJumlahPinjaman());

        System.out.println(\"Membayar angsuran\");

        System.out.print(\"Masukkan jumlah angsuran: \");

        double angsuran = scanner.nextDouble();

        donny.angsur(angsuran);

        System.out.println(\"Jumlah pinjaman saat ini: \" +
donny.getJumlahPinjaman());

        scanner.close();

    }

}

![](vertopal_4eb539c46bad4635bc4c95af0e925d21/media/image13.png){width="3.1252712160979876in"
height="1.4917957130358706in"}
