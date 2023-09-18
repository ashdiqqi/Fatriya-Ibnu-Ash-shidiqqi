public class MotorMain {
    public static void main(String[] args) {

        MotorManual mtr1 = new MotorManual();
        Motor mtr2 = new Motor();
        MotorListrik mtr3 = new MotorListrik();

        mtr1.setMerek("Supra X");
        mtr1.setCc("125 CC");
        mtr1.gas(40);
        mtr1.gantiGear(2);
        mtr1.printMotor();

        mtr2.setMerek("Beat");
        mtr2.setCc("110 CC");
        mtr2.gas(40);
        mtr2.rem(10);
        mtr2.printMotor();

        mtr3.setMerek("Viar");
        mtr3.setCc("110 CC");
        mtr3.gas(40);
        mtr3.setkapasitasBaterai("2000 mAh");
        mtr3.setBaterai(50);
        mtr3.casBaterai(false);
        mtr3.printMotor();

    }
}
