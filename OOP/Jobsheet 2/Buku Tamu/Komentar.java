public class Komentar {
    private String nama, email, komentar, jenisKelamin;

    public Komentar(String nama, String email, String komentar, String jenisKelamin) {
        this.nama = nama;
        this.email = email;
        this.komentar = komentar;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getKomentar() {
        return komentar;
    }

    public String getjenisKelamin() {
        return jenisKelamin;
    }
}
