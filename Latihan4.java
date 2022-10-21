class Hewan {
    protected String nama;

    protected void display() {
        System.out.println("I am a Cat.");
    }
}

class Cat extends Hewan {

    public void getInfo() {
        System.out.println("My name is " + nama);
    }
}

class Latihan4 {
    public static void main(String[] args) {

        // buat objek subclass
        Cat labrador = new Cat();

        // akses protected field dan method
        // gunakan objek subclass
        labrador.nama = "cutty";
        labrador.display();

        labrador.getInfo();
    }
}
