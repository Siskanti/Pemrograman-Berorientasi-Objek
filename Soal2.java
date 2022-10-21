import java.util.Vector;

class Soal2 {
    public static void main(String[] args) {
        Vector<String> nama = new Vector<>();

        // penambahan
        nama.add("S");
        nama.add("I");
        nama.add("S");
        nama.add("K");
        nama.add("A");
        nama.add("N");
        nama.add("T");
        nama.add("I");
        // ukuran arraylist
        nama.size();

        System.out.println("Alphabet: " + nama);
        System.out.println("Size:" + nama.size());
        // penghapusan
        String element = nama.remove(1);

        System.out.println("Hapus Elemen: " + element);

        System.out.println("Setelah dihapus: " + nama);
        // ukuran setelah remove
        nama.size();
        System.out.println("Size after remove:" + nama.size());

    }
}