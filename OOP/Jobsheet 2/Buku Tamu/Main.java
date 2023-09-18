import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BukuTamu bukuTamu = new BukuTamu();

        while (true) {
            System.out.println("===================================");
            System.out.println("Selamat Datang di Buku Tamu");
            System.out.println("Menu:");
            System.out.println("1. Tambah Komentar");
            System.out.println("2. Lihat Komentar");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            System.out.println();
            System.out.println("===================================");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Masukkan Komentar: ");
                    String komentar = scanner.nextLine();
                    System.out.print("Masukkan Jenis Kelamin: ");
                    String jenisKelamin = scanner.nextLine();
                    bukuTamu.tambahkanKomentar(nama, email, komentar, jenisKelamin);
                    break;

                case 2:
                    System.out.println("Daftar Komentar:");
                    bukuTamu.cetakKomentar();
                    break;

                case 3:
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
