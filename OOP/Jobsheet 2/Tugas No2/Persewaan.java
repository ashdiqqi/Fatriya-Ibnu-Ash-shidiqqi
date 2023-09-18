public class Persewaan {
    public String id, namaMember, namaGame;
    public int harga, lama;

    public void tampilData() {
        System.out.println(" ID Peminjaman: " + id);
        System.out.println(" Nama Member: " + namaMember);
        System.out.println(" Nama Game: " + namaGame);
        System.out.println(" Lama Sewa: " + lama + " hari");
        System.out.println(" Total Harga: " + totalHarga() + " Rupiah");
    }

    public int totalHarga() {
        return harga * lama;
    }
}
