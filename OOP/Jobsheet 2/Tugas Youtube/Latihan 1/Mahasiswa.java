public class Mahasiswa {
    public int nim;
    public String nama;
    public String jenisKelamin;
    public String alamat;
    public int noTelepon;
    public String email;

    public void nim(int value) {
        nim = value;
    }

    public void nama(String value) {
        nama = value;
    }

    public void jenisKelamin(String value) {
        jenisKelamin = value;
    }

    public void alamat(String value) {
        alamat = value;
    }

    public void noTelepon(int value) {
        noTelepon = value;
    }

    public void email(String value) {
        email = value;
    }

    public void cetakInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + noTelepon);
        System.out.println("Email: " + email);
    }
}