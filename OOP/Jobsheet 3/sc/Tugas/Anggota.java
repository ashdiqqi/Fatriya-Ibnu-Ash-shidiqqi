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
        if (jumlah <= 0) {
            System.out.println("Jumlah pinjaman harus lebih dari 0.");
        } else if (jumlah + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah angsuran harus lebih dari 0.");
        } else if (jumlah < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else if (jumlah > jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
}
