import java.util.Scanner;

public class PersegiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persegi persegi = new Persegi();

        System.out.print("Masukkan sisi Persegi: ");
        persegi.sisi = input.nextInt();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampil Sisi");
            System.out.println("2. Hitung Keliling");
            System.out.println("3. Hitung Luas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    persegi.tampilData();
                    break;
                case 2:
                    System.out.println("Keliling: " + persegi.hitungKeliling());
                    break;
                case 3:
                    System.out.println("Luas: " + persegi.hitungLuas());
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);
    }
}
