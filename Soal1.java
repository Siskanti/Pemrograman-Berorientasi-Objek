import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soal1 {
    public static void main(String[] args) {
        Object[] jeniswarna = { "Purple", "Dusty", "Hijau", "Grey", "Navy", "Silver", "Putih", "abuMuda", "Coklat",
                "Mocca" };
        Object[] menghapuswarna = { "Hijau", "Mocca", "abuMuda" };

        List warna = new ArrayList();
        List hapuswarna = new ArrayList();

        warna.addAll(Arrays.asList(jeniswarna));
        hapuswarna.addAll(Arrays.asList(menghapuswarna));

        System.out.println("Warna" + warna);
        System.out.println("Warna yang dihapus " + hapuswarna);
        warna.removeAll(hapuswarna);
        System.out.println("Warna tersisa" + warna);

    }
}