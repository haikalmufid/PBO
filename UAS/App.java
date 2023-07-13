public class App {
    public static void main(String[] args) {
        int jumlahPesanan = InputHandler.getIntInput("Masukkan jumlah pesanan");
        Pesanan[] pesananArray = new Pesanan[jumlahPesanan];;
        System.out.println("======================");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke - " + (i + 1));
            String namaBarang = InputHandler.getStringInput("Masukkan nama barang");
            int jumlah = InputHandler.getIntInput("Masukkan jumlah");
            double harga = InputHandler.getDoubleInput("Masukkan harga");

            Pesanan pesanan = new PesananBuilder()
                    .setNamaBarang(namaBarang)
                    .setJumlah(jumlah)
                    .setHarga(harga)
                    .build();

            System.out.println();
            pesananArray[i] = pesanan;
        }

        String alamatPengiriman = InputHandler.getStringInput("Masukkan alamat pengiriman");
        System.out.println("========================");
        System.out.println("List Pesanan ");
        for (Pesanan pesanan : pesananArray) {
            pesanan.printPesanan();
        }

        System.out.println();
        double totalHarga = TotalHargaCalculator.hitungTotalHarga(pesananArray);
        System.out.println("Total Harga Pesanan: " + totalHarga);
        System.out.println("Alamat Pengiriman: " + alamatPengiriman);
    }
}
