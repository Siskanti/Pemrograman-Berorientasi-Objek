class buah {
    // method di parent class
    public void makan() {
        System.out.println("Saya suka makan buah");

    }

}

class Anggur extends buah {
    // overriding method makan()
    @Override
    public void makan() {
        //panggil method dari parent class
        super.makan();
        System.out.println("Saya suka makan buah Anggur");
    }

}

public class Latihan3 {
    public static void main(String[] args) {
        Anggur buah = new Anggur();
        // method makan() di panggil
        buah.makan();
    }
    
}
