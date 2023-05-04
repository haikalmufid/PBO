package Abstract;

public class Buff extends Hero{
    public Buff(String nama, int power, int level) {
        super(nama, power, level);
    }

    @Override
    public void tampil(){
        System.out.println("Hero : " + getNama());
        System.out.println("Power : " + (getPower() * 4 ));
        System.out.println("Level : " + (level + 3) );
        // System.out.println("Tipe : " + getTipe());
    }
}
