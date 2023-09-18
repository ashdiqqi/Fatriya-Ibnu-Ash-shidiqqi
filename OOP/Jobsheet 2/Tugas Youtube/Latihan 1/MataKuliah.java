public class MataKuliah {
    public int kodeMK;
    public String namaMK;
    public int sks;
    public int nilai;

    public void kodeMK(int value) {
        kodeMK = value;
    }

    public void namaMK(String value) {
        namaMK = value;
    }

    public void sks(int value) {
        sks = value;
    }

    public void nilai(int value) {
        nilai = value;
    }

    public void cetakInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Nilai: " + nilai);
    }
}