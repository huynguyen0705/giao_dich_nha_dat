public class ThucHienGiaoDich {
    GiaoDichNha[] dsGiaoDichNha;
    GiaoDichDat[] dsGiaoDichDat;
    public void ThucHienGiaoDich(){

    }
    public ThucHienGiaoDich(){
        dsGiaoDichNha = new GiaoDichNha[5];
        dsGiaoDichDat = new GiaoDichDat[5];
    }

    public void ThemGDDat(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiDat, double dienTich){
        GiaoDichDat giaoDichDat = new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, loaiDat, dienTich);
        boolean check = true;
        for (int i = 0; i < dsGiaoDichDat.length; i++) {
            if (dsGiaoDichDat[i] == null) {
                dsGiaoDichDat[i] = giaoDichDat;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("giao dich da day");
        }
    }

    public void ThemGDNha(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiNha, String diaChi, double dienTich){
        GiaoDichNha giaoDichNha = new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, loaiNha, diaChi, dienTich);
        boolean check = true;
        for (int i = 0; i < dsGiaoDichNha.length; i++) {
            if (dsGiaoDichNha[i] == null) {
                dsGiaoDichNha[i] = giaoDichNha;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("giao dich da day");
        }
    }

    public void XuatGDDat(){
        for (int i = 0; i < dsGiaoDichDat.length; i++) {
            if(dsGiaoDichDat[i]!=null){
                System.out.println(dsGiaoDichDat[i].HienThiDat());
            }
        }
    }

    public void XuatGDNha(){
        for (int i = 0; i < dsGiaoDichNha.length; i++) {
            if(dsGiaoDichNha[i]!=null){
                System.out.println(dsGiaoDichNha[i].HienThiNha());
            }
        }
    }

    public double TinhTongDienTichDat(){
        double tongdientichdat = 0;
        for (int i = 0; i < dsGiaoDichDat.length; i++){
            if (dsGiaoDichDat[i] != null){
                tongdientichdat = tongdientichdat + dsGiaoDichDat[i].getDienTich();
            }
        }
        return tongdientichdat;
    }

    public double TinhTongDienTichNha(){
        double tongdientichnha = 0;
        for (int i = 0; i < dsGiaoDichNha.length; i++){
            if (dsGiaoDichNha[i] != null){
                tongdientichnha = tongdientichnha + dsGiaoDichNha[i].getDienTich();
            }
        }
        return tongdientichnha;
    }

    public double TrungBinhThanhTienGDDat(){
        double tongtien = 0;
        int count = 0;
        for (int i = 0; i < dsGiaoDichDat.length; i++){
            if (dsGiaoDichDat[i] != null){
                tongtien = tongtien + dsGiaoDichDat[i].ThanhTienGDDat();
                count++;
            }
        }
        return tongtien/count;
    }

    public void XuatGDThang9Nam2013(){
        System.out.println("Cac GD cua thang 9 nam 2013: ");
        for (int i = 0; i < dsGiaoDichDat.length; i++){
            if (dsGiaoDichDat[i] != null) {
                String ngayGiaoDich = dsGiaoDichDat[i].getNgayGiaoDich();
                String[] path = ngayGiaoDich.split("/");
                if (path[1].equals("09") && path[2].equals("2013")) {
                    System.out.println(ngayGiaoDich);
                }
            }
        }
    }
}
