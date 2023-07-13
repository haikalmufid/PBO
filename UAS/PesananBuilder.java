public class PesananBuilder {
    private Pesanan pesanan;

    public PesananBuilder() {
        pesanan = new Pesanan();
    }

    public PesananBuilder setNamaBarang(String namaBarang) {
        pesanan.setNamaBarang(namaBarang);
        return this;
    }

    public PesananBuilder setJumlah(int jumlah) {
        pesanan.setJumlah(jumlah);
        return this;
    }

    public PesananBuilder setHarga(double harga) {
        pesanan.setHarga(harga);
        return this;
    }

    public PesananBuilder setAlamatPengiriman(String alamatPengiriman) {
        pesanan.setAlamatPengiriman(alamatPengiriman);
        return this;
    }

    public Pesanan build() {
        return pesanan;
    }
}
