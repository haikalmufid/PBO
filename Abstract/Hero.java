package Abstract;

public abstract class Hero {
    private String nama;
    private int power;
    protected int level;

    public Hero(String nama, int power, int level){
        this.nama = nama;
        this.power = power;
        this.level =  level;
    }

    public String getNama(){
        return nama;
    }

    public int getPower(){
        return power;
    }

    public int getLevel(){
        return level;
    }

    public abstract void tampil();
}
