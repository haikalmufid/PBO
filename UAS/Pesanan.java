public class Pesanan {
    private String namaBarang;
    private int jumlah;
    private double harga;
    private String alamatPengiriman;

    public Pesanan(String namaBarang, int jumlah, double harga, String alamatPengiriman) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
        this.alamatPengiriman = alamatPengiriman;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    public void printPesanan() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga : " + harga);
    }
}