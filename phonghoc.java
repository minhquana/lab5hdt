abstract class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String dayNha, double dienTich2, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich2;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    @Override
    public String toString() {
        return "Mã phòng: " + maPhong +
                ", Dãy nhà: " + dayNha +
                ", Diện tích: " + dienTich +
                ", Số bóng đèn: " + soBongDen;
    }

    public abstract void setChuyenNganh(String chuyenNganh);

    protected abstract void setSucChua(int sucChua);

    public boolean datChuan() {
        return true;
    }
}
