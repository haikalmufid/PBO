package jagoan;

public class Tipe extends Hero {
    private String tipe;

    // constructor
    public Tipe(String nama, int power, int level, String tipe) {
        super(nama, power, level);
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public void tampil() {
        System.out.println("Nama : " + getNama());
        System.out.println("Power : " + (getPower() + 40) );
        System.out.println("Level : " + (level + 2));
        System.out.println("Tipe : " + tipe );
    }

}