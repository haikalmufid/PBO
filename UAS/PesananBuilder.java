public class PesananBuilder {
    private String namaBarang;
    private int jumlah;
    private double harga;
    private String alamatPengiriman;

    public PesananBuilder setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
        return this;
    }

    public PesananBuilder setJumlah(int jumlah) {
        this.jumlah = jumlah;
        return this;
    }

    public PesananBuilder setHarga(double harga) {
        this.harga = harga;
        return this;
    }

    public PesananBuilder setAlamatPengiriman(String alamatPengiriman) {
        this.alamatPengiriman = alamatPengiriman;
        return this;
    }

    public Pesanan build() {
        return new Pesanan(namaBarang, jumlah, harga, alamatPengiriman);
    }
}
