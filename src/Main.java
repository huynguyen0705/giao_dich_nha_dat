import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ThucHienGiaoDich thucHienGiaoDich = new ThucHienGiaoDich();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Chuong trinh quan ly giao dich");
            System.out.println("1. Nhap xuat danh sach cac giao dich");
            System.out.println("2. Tinh tong so luong cho tung loai");
            System.out.println("3. Tinh trung binh thanh tien cua giao dich dat");
            System.out.println("4. Xuat ra cac giao dich cua thang 9 nam 2013");
            System.out.println("Vui long nhap lua chon: ");
            int input = scanner.nextInt();
            if (input < 1 || input > 4){
                System.out.println("Nhap khong hop le");
            }

            switch (input){
                case 1:
                    System.out.println("1. Nhap giao dich dat");
                    System.out.println("2. Nhap giao dich nha");
                    int input1 = scanner.nextInt();
                    if (input1 < 1 || input1 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input1){
                        case 1:
                            System.out.println("Nhap ma giao dich: ");
                            Scanner scanner1 = new Scanner(System.in);
                            String maGiaoDich = scanner1.next();
                            System.out.println("Nhap ngay giao dich: ");
                            Scanner scanner2 = new Scanner(System.in);
                            String ngayGiaoDich = scanner2.next();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner3 = new Scanner(System.in);
                            double donGia = scanner3.nextDouble();
                            System.out.println("Nhap loai dat: ");
                            Scanner scanner4 = new Scanner(System.in);
                            String loaiDat = scanner4.next();
                            System.out.println("Nhap dien tich: ");
                            Scanner scanner5 = new Scanner(System.in);
                            double dienTich = scanner5.nextDouble();
                            thucHienGiaoDich.ThemGDDat(maGiaoDich, ngayGiaoDich, donGia, loaiDat, dienTich);

                        case 2:
                            System.out.println("Nhap ma giao dich: ");
                            Scanner scanner6 = new Scanner(System.in);
                            String maGiaoDich1 = scanner6.next();
                            System.out.println("Nhap ngay giao dich: ");
                            Scanner scanner7 = new Scanner(System.in);
                            String ngayGiaoDich1 = scanner7.next();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner8 = new Scanner(System.in);
                            double donGia1 = scanner8.nextDouble();
                            System.out.println("Nhap loai nha: ");
                            Scanner scanner9 = new Scanner(System.in);
                            String loaiNha = scanner9.next();
                            System.out.println("Nhap dia chi: ");
                            Scanner scanner10 = new Scanner(System.in);
                            String diaChi = scanner10.next();
                            System.out.println("Nhap dien tich: ");
                            Scanner scanner11 = new Scanner(System.in);
                            double dienTich1 = scanner11.nextDouble();
                            thucHienGiaoDich.ThemGDNha(maGiaoDich1, ngayGiaoDich1, donGia1, loaiNha, diaChi, dienTich1);
                    }
                case 2:
                    System.out.println("1. Tong dien tich dat");
                    System.out.println("2. Tong dien tich nha");
                    int input2 = scanner.nextInt();
                    if (input2 < 1 || input2 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input2){
                        case 1:
                            System.out.println("Tong dien tich dat: " + thucHienGiaoDich.TinhTongDienTichDat());
                        case 2:
                            System.out.println("Tong dien tich nha: " + thucHienGiaoDich.TinhTongDienTichNha());
                    }
                case 3:
                    System.out.println("Trung binh thanh tien GD Dat: " + thucHienGiaoDich.TrungBinhThanhTienGDDat());
                case 4:
                    thucHienGiaoDich.XuatGDThang9Nam2013();
            }
        }
    }
}