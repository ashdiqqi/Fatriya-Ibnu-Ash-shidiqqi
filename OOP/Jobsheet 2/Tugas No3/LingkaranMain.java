import java.util.Scanner;

public class LingkaranMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = scanner.nextDouble();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = r;

        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);

    }
}
