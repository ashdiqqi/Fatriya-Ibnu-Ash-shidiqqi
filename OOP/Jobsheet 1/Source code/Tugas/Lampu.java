public class Lampu {
    private String merek, jenis;
    private int daya;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setJenis(String newValue) {
        jenis = newValue;
    }

    public void setDaya(int newValue) {
        daya = newValue;
    }

    public void print() {
        System.out.println("Merek lampu: " + merek);
        System.out.println("Daya Lampu: " + daya + " watt");
        System.out.println("Jenis Lampu: " + jenis);
    }

    public static void main(String[] args) {
        Lampu lmp = new Lampu();
        lmp.setMerek("Phillips");
        lmp.setJenis("LED");
        lmp.setDaya(20);
        lmp.print();
    }
}
