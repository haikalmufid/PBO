package Abstract;

public class Buff extends Hero{
    protected String tipe;
    public Buff(String nama, int power, int level, String tipe) {
        super(nama, power, level);
        this.tipe = tipe;
    }

    @Override
    public void tampil(){
        System.out.println("Hero : " + getNama());
        System.out.println("Power : " + (getPower() * 4 ));
        System.out.println("Level : " + (level + 3) );
        System.out.println("Tipe : " + tipe);
    }
}
