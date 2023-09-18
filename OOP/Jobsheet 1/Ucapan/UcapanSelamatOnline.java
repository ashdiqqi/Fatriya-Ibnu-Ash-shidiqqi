public class UcapanSelamatOnline {
    private String nama;
    private String email;
    private String ucapan;

    public void setNama(String newValue) {
        nama = newValue;
    }

    public void setEmail(String newValue) {
        email = newValue;
    }

    public void setUcapan(String newValue) {
        ucapan = newValue;
    }

    public void print() {
        System.out.println("============================");
        System.out.println("Ucapan Selamat Online.");
        System.out.println("nama: " + nama);
        System.out.println("email: " + email);
        System.out.println("komentar: " + ucapan);
        System.out.println("============================");
    }
}
