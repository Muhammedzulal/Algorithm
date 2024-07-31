public class example23 {
    public static void dizitoplamRecursive(int[] dizi, int index, int toplam) {
        if (index == dizi.length - 1) {
            System.out.println("Dizi toplamı: " + toplam);
            return;
        }
        toplam += dizi[index];
        dizitoplamRecursive(dizi, index + 1, toplam);
    }

    public static void main(String[] args) {

        int[] dizi = { 1, 2, 3, 4, 5 };
        dizitoplamRecursive(dizi, 0, 0);
    }
}
