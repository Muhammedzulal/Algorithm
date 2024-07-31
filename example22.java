public class example22 {
    public static int toplam(int i1, int i2) {
        int top = 0;
        for (int i = i1; i <= i2; i++)
            top += i;
        return top;
    }

    public static void main(String[] args) {

        System.out.println("1-10 arası toplam :" + toplam(1, 10));
        System.out.println("20-30 arası toplam : " + toplam(20, 30));
        System.out.println("35-45 arası " + toplam(35, 45));
    }
}
