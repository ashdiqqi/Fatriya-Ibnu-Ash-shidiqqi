import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("Meminjam uang");
        System.out.print(" Masukkan jumlah pinjaman: ");
        double pinjaman = scanner.nextDouble();
        donny.pinjam(pinjaman);

        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.println("Membayar angsuran");
        System.out.print("Masukkan jumlah angsuran: ");
        double angsuran = scanner.nextDouble();
        donny.angsur(angsuran);

        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        scanner.close();
    }
}
