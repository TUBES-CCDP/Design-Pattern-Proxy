class BangunDatarProxy implements BangunDatar {
    private BangunDatar bangunDatar;
    private double tempArea = 0.0;
    public BangunDatarProxy(BangunDatar bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public double hitungArea() {
        if (tempArea == 0.0) {
            tempArea = bangunDatar.hitungArea();
        }
        return tempArea;
    }

    public void tampil() {
        bangunDatar.tampil();
    }
}