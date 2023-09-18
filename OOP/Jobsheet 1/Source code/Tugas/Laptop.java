public class Laptop {
    private String merek, cpu;
    private int ram;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setRam(int newValue) {
        ram = newValue;
    }

    public void setCpu(String newValue) {
        cpu = newValue;
    }

    public void print() {
        System.out.println("Merek laptop: " + merek);
        System.out.println("Kapasitas RAM: " + ram + " GB");
        System.out.println("Processor Laptop: " + cpu);
    }

    public static void main(String[] args) {
        Laptop lt = new Laptop();
        lt.setMerek("HP");
        lt.setRam(8);
        lt.setCpu("Intel core i5");
        lt.print();
    }
}
