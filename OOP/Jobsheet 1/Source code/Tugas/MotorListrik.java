public class MotorListrik extends Motor {
    private String kapasitasBaterai;
    private int baterai;
    private boolean casBaterai;

    public void setkapasitasBaterai(String newValue) {
        kapasitasBaterai = newValue;
    }

    public void setBaterai(int newValue) {
        baterai = newValue;
    }

    public void casBaterai(boolean cas) {
        casBaterai = cas;
        if (casBaterai) {
            baterai = 100;
        }
    }

    public void printMotor() {
        super.printMotor();
        System.out.println("Kapasitas baterai: " + kapasitasBaterai);
        System.out.println("Baterai saat ini: " + baterai);
    }
}
