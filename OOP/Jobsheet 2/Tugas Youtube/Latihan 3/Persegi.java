public class Persegi {
    int sisi;

    public int hitungLuas() {
        return sisi * sisi;
    }

    public int hitungKeliling() {
        return 4 * sisi;
    }

    public void tampilData() {
        System.out.println("Panjang sisi: " + sisi);

    }
}