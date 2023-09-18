public class Main {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        Dosen dsn = new Dosen();
        MataKuliah mk = new MataKuliah();
        
        mhs.nim(221720161);
        mhs.nama("Figas");
        mhs.jenisKelamin("Laki-laki");
        mhs.alamat("Lamongan");
        mhs.noTelepon(132890123);
        mhs.email("digas@email.com");
        mhs.cetakInformasi();
        System.out.println();
        
        dsn.nip(189773422);
        dsn.nama("Ganjar");
        dsn.jenisKelamin("Laki-laki");
        dsn.alamat("Semarang");
        dsn.noTelepon(189943233);
        dsn.email("ganjar@email.com");
        dsn.cetakInformasi();
        System.out.println();
        
        mk.kodeMK(001);
        mk.namaMK("Pemrograman Berbasis Objek");
        mk.sks(2);
        mk.nilai(90);
        mk.cetakInformasi();
        System.out.println();
    }
}