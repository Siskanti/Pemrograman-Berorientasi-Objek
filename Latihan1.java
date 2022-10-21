class Hero {
    // method of the parent class
    String nama;
    public void display() {
        System.out.println("Hero 3: " + this.nama);
    }
}
//inherit from Hero
class HeroStrength extends Hero {
    //walaupun dikosongkan tetapi program tetap dijalankan
}
class HeroIntelligent extends Hero {
    // kosong
}
public class Latihan1 {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.nama = "Sun-Oh";

        System.out.println("Hero 1: " + hero1.nama);

        Hero hero2 = new Hero();
        hero2.nama = "Hyeong";
        System.out.println("Hero 2: " + hero2.nama);

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.nama = "KimJojo";
        hero3.display();
    }
}
