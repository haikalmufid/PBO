package Abstract;

public class main {
    public static void main(String[]args) {
        Hero h1 = new Tipe("Yu Zhong", 100, 5, "Fighter");
        Hero h2 = new Buff("Yu Zhong", 100, 5);
        
        h1.tampil();
        System.out.println();
        h2.tampil();
    }
}
