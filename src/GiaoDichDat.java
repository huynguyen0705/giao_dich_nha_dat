public class GiaoDichDat extends GiaoDich{
    private String LoaiDat;

    public String getLoaiDat() {
        return LoaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        LoaiDat = loaiDat;
    }
    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiDat, double dienTich){
        setMaGiaoDich(maGiaoDich);
        setNgayGiaoDich(ngayGiaoDich);
        setDonGia(donGia);
        setLoaiDat(loaiDat);
        setDienTich(dienTich);
    }

    public double ThanhTienGDDat(){
        double thanhtien = 0;
        if (LoaiDat.equals("A")){
            thanhtien = getDienTich() * getDonGia() * 1.5;
        } else if (LoaiDat.equals("B") || LoaiDat.equals("C")) {
            thanhtien = getDienTich() * getDonGia();
        }
        return thanhtien;
    }
    public String HienThiDat(){
        System.out.println("Ma giao dich: " + getMaGiaoDich());
        System.out.println("Ngay giao dich: " + getNgayGiaoDich());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Loai dat: " + getLoaiDat());
        System.out.println("Dien tich: " + getDienTich());
        return "----------";
    }
}
