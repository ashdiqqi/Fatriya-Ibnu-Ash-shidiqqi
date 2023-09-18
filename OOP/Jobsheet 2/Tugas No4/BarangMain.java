public class BarangMain {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.setNamaBarang("Tas");
        brg.setKode("ATK3725");
        brg.setHargaDasar(75000);
        brg.setDiskon(30);
        brg.tampilData();
    }
}
