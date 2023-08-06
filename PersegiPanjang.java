class PersegiPanjang implements BangunDatar {
    private double panjang;
    private double lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungArea() {
        return panjang * lebar;
    }
    public void tampil() {
        System.out.println("Persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " memiliki luas " + hitungArea());
    }
}