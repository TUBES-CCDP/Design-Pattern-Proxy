class Lingkaran implements BangunDatar {
    private double radius;
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    public double hitungArea() {
        return Math.PI * radius * radius;
    }
    public void tampil() {
        System.out.println("Lingkaran dengan radius " + radius + " memiliki luas " + hitungArea());
    }
}