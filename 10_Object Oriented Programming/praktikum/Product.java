// Winanda Greace A. Sinaga
// 7038320 - Be A Top Search Quality Engineer - Alterra Academy Batch 5

public class Product {
    // Atribut
    private String nama;
    private String deskripsi;
    private double harga;
    private int jlhStok;

    // Konstruktor
    public Product(String nama, String deskripsi, double harga, int jlhStok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jlhStok = jlhStok;
    }

    // Method Setter - Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setJlhStok(int jlhStok) {
        this.jlhStok = jlhStok;
    }

    public int getJlhStok() {
        return jlhStok;
    }

    // Method getInfo - informasi data produk
    public void getInfo() {
        System.out.println("nama: " + nama);
        System.out.println("deskripsi: " + deskripsi);
        System.out.println("harga: " + harga);
        System.out.println("jumlah stok: " + jlhStok);
    }

    // test
    public static void main(String[] args) {
        Product product1 = new Product("coffee", "this is coffee", 15000, 10);
        Product product2 = new Product("milk", "this is milk", 25000, 10);
        Product product3 = new Product("apple juice", "this is juice", 18000, 20);

        // Informasi Produk
        System.out.println("INFO PRODUK:");
        product1.getInfo();
        System.out.println("==========================");

        System.out.println("INFO PRODUK:");
        product2.getInfo();
        System.out.println("==========================");

        System.out.println("INFO PRODUK:");
        product3.getInfo();
        System.out.println("==========================");
    }
}