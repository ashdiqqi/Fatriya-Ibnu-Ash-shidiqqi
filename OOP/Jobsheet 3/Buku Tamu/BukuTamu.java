package pertemuan2.BukuTamu2;

import java.util.ArrayList;
import java.util.List;

public class BukuTamu {
    private List<Komentar> listKomentar;

    public BukuTamu() {
        listKomentar = new ArrayList<>();
    }

    public void addKomentar(String nama, String email, String komen, String alamat) {
        Komentar komentar = new Komentar(nama, email, komen, alamat);
        listKomentar.add(komentar);
    }

    public List<Komentar> getListKomentar() {
        return listKomentar;
    }
}
