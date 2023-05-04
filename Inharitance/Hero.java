package jagoan;

public class Hero {
    private String nama;
    private int power;
    protected int level;

    // constructor
    public Hero(String nama, int power, int level) {
        this.nama = nama;
        this.power = power;
        this.level = level;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPower() { // perbaikan pada method power
        return this.power;
    }

    public void setPower(int power) { // perbaikan pada method power
        this.power = power;
    }

    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Power : " + power);
        System.out.println("Level : " + level);
    }
}