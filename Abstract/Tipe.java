package Abstract;

public class Tipe extends Hero {
    private String tipe; 
    public Tipe(String nama, int power, int level, String tipe){
        super(nama,power,level);
        this.tipe = tipe;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    @Override
    public void tampil(){
        System.out.println("Hero : " + getNama());
        System.out.println("Power : " + getPower());
        System.out.println("Level : " + level);
        System.out.println("Tipe : " + tipe);
    }
}
