package pertemuan2.BukuTamu2;

public class Komentar {
    private String nama;
    private String email;
    private String komen;
    private String alamat;

    public Komentar(String nama, String email, String komen, String alamat) {
        this.nama = nama;
        this.email = email;
        this.komen = komen;
        this.alamat = alamat;
    }

    public void print() {
        System.out.println("===============================");
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Komentar: " + komen);
    }
}