public class GiaoDichNha extends GiaoDich{
    private String LoaiNha;
    private String DiaChi;

    public String getLoaiNha() {
        return LoaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        LoaiNha = loaiNha;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiNha, String diaChi, double dienTich){
        setMaGiaoDich(maGiaoDich);
        setNgayGiaoDich(ngayGiaoDich);
        setDonGia(donGia);
        setLoaiNha(loaiNha);
        setDiaChi(diaChi);
        setDienTich(dienTich);
    }

    public double ThanhTienGDNha(){
        double thanhtien = 0;
        if (LoaiNha.equals("thuong")){
            thanhtien = getDienTich() * getDonGia() * 90 / 100 ;
        } else if (LoaiNha.equals("cao cap")) {
            thanhtien = getDienTich() * getDonGia();
        }
        return thanhtien;
    }
    public String HienThiNha(){
        System.out.println("Ma giao dich: " + getMaGiaoDich());
        System.out.println("Ngay giao dich: " + getNgayGiaoDich());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Loai nha: " + getLoaiNha());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("Dien tich: " + getDienTich());
        return "----------";
    }
}
