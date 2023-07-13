public class Pesanan {
    private String namaBarang;
    private int jumlah;
    private double harga;
    private String alamatPengiriman;

    public Pesanan() {
        // Konstruktor default
    }

    public Pesanan(String namaBarang, int jumlah, double harga, String alamatPengiriman) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
        this.alamatPengiriman = alamatPengiriman;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    public void setAlamatPengiriman(String alamatPengiriman) {
        this.alamatPengiriman = alamatPengiriman;
    }

    public void printPesanan() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
    }
}

