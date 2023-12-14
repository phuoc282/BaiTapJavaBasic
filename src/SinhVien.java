public class SinhVien {
    public static String diaChi = "Thừa Thiên Huế";
    public int tuoi = 21;

    public void PhatBieu() {
        String Ten = "Đặng Thanh Phước";
        System.out.println("Họ và Tên: " + Ten);
        System.out.println("Tuổi: " + tuoi);
    }

    public static void main(String[] args) {
        SinhVien henvato = new SinhVien();
        henvato.PhatBieu();
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Mã số: " + ThongTin.maSo);
        System.out.println("Lớp: " + ThongTin.lop);

    }
}
