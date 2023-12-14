public class Calculator {
    public static double tong2SoThuc(double soThuc1, double soThuc2) {
        return soThuc1 + soThuc2;
    }

    public static int tong2SoNguyen(int soNguyen1, int soNguyen2) {
        return soNguyen1 + soNguyen2;
    }

    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên là: " + tong2SoNguyen(534, 346));
        System.out.println("Tổng 2 số thực là: " + tong2SoThuc(12.5, 21.7));
    }
}
