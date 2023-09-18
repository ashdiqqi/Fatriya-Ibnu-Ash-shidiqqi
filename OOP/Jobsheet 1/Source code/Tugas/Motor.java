public class Motor {
    private String merek;
    private int kecepatan;
    private String cc;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setCc(String newValue) {
        cc = newValue;
    }

    public void gas(int tambah) {
        kecepatan = kecepatan + tambah;
    }

    public void rem(int kurang) {
        kecepatan = kecepatan - kurang;
    }

    public void printMotor() {
        System.out.println("Merek motor: " + merek);
        System.out.println("Kecepatan motor: " + kecepatan);
        System.out.println("cc motor: " + cc);
    }
}
