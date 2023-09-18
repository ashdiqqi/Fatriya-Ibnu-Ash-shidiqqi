public class MotorManual extends Motor {
    private int gear;

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void printMotor() {
        super.printMotor();
        System.out.println("Gear: " + gear);
    }
}
