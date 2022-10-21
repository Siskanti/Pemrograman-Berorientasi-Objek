
import java.util.LinkedList;

class Soal4 {
    public static void main(String[] args) {

        LinkedList<String> daftarbuku = new LinkedList<>();

        // menambahkan data
        daftarbuku.add("Structured Computer");
        daftarbuku.add("Hackers");
        daftarbuku.add("The Soul Of A New Machine Tracy Kidder");
        daftarbuku.add("Pemrograman Komputer");
        daftarbuku.add("Data Visualization");
        daftarbuku.add("Srtuctured Computer");
        daftarbuku.add("Pemrograman");
        daftarbuku.add("Matematika Diskrit");
        daftarbuku.add("Metode Statistika");
        daftarbuku.add("Logika Komputer");

        System.out.println("Nama daftarbuku di Perpustakaan: " + daftarbuku);

        // Menghitung jumlah buku
        System.out.println("Jumlah daftarbuku di Perpustakaan: " + 
        daftarbuku.size());

    }
}
