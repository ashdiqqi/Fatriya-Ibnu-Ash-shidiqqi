import java.util.Scanner;

public class UcapanSelamatOnlineMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UcapanSelamatOnline[] daftarUcapan = new UcapanSelamatOnline[10];

        int menu;
        int jumlahUcapan = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Ucapan");
            System.out.println("2. Lihat Ucapan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (jumlahUcapan < daftarUcapan.length) {
                        System.out.println("============================");
                        System.out.println("Ucapan Selamat Online.");
                        UcapanSelamatOnline ucp = new UcapanSelamatOnline();

                        System.out.println("Masukkan nama Anda: ");
                        ucp.setNama(sc.nextLine());

                        System.out.println("Masukkan email Anda: ");
                        ucp.setEmail(sc.nextLine());

                        System.out.println("Masukkan ucapan selamat Anda: ");
                        ucp.setUcapan(sc.nextLine());
                        System.out.println("=============================");

                        daftarUcapan[jumlahUcapan] = ucp;
                        jumlahUcapan++;
                    } else {
                        System.out.println("ucapan sudah penuh.");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Ucapan Selamat:");
                    for (int i = 0; i < jumlahUcapan; i++) {
                        daftarUcapan[i].print();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
            }
        } while (menu != 3);
    }
}
