public class Barang {
    private String kode, namaBarang;
    private int hargaDasar;
    private float diskon;

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaDasar(int hargaDasar) {
        this.hargaDasar = hargaDasar;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public void tampilData() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kode Barang : " + kode);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon);
        System.out.print("Total Harga: " + hitungHargaJual());
    }

    public int hitungHargaJual() {
        return hargaDasar - (int) (hargaDasar * diskon / 100);
    }
}
