interface mahasiswaBaru {
    public void display();
 }
 
 class Prodi {
    public void jurusan() {
 
       // anonymous class implementing interface
       mahasiswaBaru p1 = new mahasiswaBaru() {
          public void display() {
             System.out.println("Program Studi Sistem Informasi");
          }
       };
       p1.display();
    }
 }
 
 class Implementasi {
    public static void main(String[] args) {
       Prodi obj = new Prodi();
       obj.jurusan();
    }
 }