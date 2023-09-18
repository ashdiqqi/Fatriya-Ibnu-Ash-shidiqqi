package pertemuan2.BukuTamu2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BukuTamu bukuTamu = new BukuTamu();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Tamu");
            System.out.println("2. Lihat Komentar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Email: ");
                    String email = sc.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Masukkan Komentar: ");
                    String komen = sc.nextLine();

                    bukuTamu.addKomentar(nama, email, komen, alamat);
                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:
                    System.out.println("Daftar Komentar :");
                    List<Komentar> listKomentar = bukuTamu.getListKomentar();
                    for (Komentar komentar : listKomentar) {
                        komentar.print();
                    }
                    break;

                case 3:
                    System.out.println("Terima Kasih");
                    System.exit(0);

                default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
            }
        }
    }
}
