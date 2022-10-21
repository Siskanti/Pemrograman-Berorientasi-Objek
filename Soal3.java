import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Soal3 {
    public static void main(String[] args) {
        Queue<String> orangmengantri = new LinkedList<>();
        orangmengantri.add("reni");
        orangmengantri.add("adi");
        orangmengantri.add("toni");
        orangmengantri.add("susi");
        orangmengantri.add("reva");
       
        System.out.println("jumlah  antrian: " + orangmengantri.size());
        System.out.println("pengantri awal: " + orangmengantri);
        
        ArrayList<String> menghapus = new ArrayList<>();
        menghapus.add("reva");
        menghapus.add("susi");
        System.out.println("Yang keluar dari antrian: " + menghapus);

        for(int i = 0; i < menghapus.size(); i++){
            orangmengantri.remove(menghapus.get(i));
        }
        ArrayList<String> tambah = new ArrayList<>();
        tambah.add("java");
        tambah.add("sita");
        orangmengantri.addAll(tambah);
        System.out.println("antrian baru: " + orangmengantri);
    }    
}
