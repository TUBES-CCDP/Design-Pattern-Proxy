public class Main {
    public static void main(String[] args) {
        BangunDatar persegiPanjang = new BangunDatarProxy(new PersegiPanjang(4, 6));
        BangunDatar lingkaran = new BangunDatarProxy(new Lingkaran(5));
        
        // menggunakan proxy
        persegiPanjang.tampil();
        lingkaran.tampil();

        // hasil dari tempArea
        System.out.println("Hasil dari tempArea persegi panjang: " + persegiPanjang.hitungArea());
        System.out.println("Hasil dari tempArea lingkaran: " + lingkaran.hitungArea());
    }
}