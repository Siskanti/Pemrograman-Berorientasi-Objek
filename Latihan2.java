class fruit {
    // method di parent class
    public void makan() {
        System.out.println("Saya suka makan buah");

    }

}

class Apel extends fruit {
    // overriding method makan()
    @Override
    public void makan() {
        System.out.println("Saya suka makan buah Apel");
    }

}

public class Latihan2 {
    public static void main(String[] args) {
        Apel buah = new Apel();
        // method makan() di panggil
        buah.makan();

    }

}
