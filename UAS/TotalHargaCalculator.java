class TotalHargaCalculator {
    public static double hitungTotalHarga(Pesanan[] pesananArray) {
        double totalHarga = 0;
        for (Pesanan pesanan : pesananArray) {
            totalHarga += pesanan.getHarga() * pesanan.getJumlah();
        }
        return totalHarga;
    }
}