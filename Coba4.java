public class Coba4 {
    public void display1() {
        System.out.println("Method without parameter");

    }

    public void display2(int a) {
        System.out.println("Method with a single parameter");

    }

    public static void main(String[] args) {
        Coba4 obj = new Coba4();
        obj.display1();
        obj.display2(24);

    }
}
