
import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {
        int maks = 0;
        int min = 0;
        double toplam = 0;
        double a = 0;
        try (Scanner klavye = new Scanner(System.in)) {

            for (int i = 1; i <= 10; i++) {

                System.out.print(i + ". Sayıyı giriniz :");
                int sayi = klavye.nextInt();
                if (i == 1) {
                    maks = sayi;
                    min = sayi;
                } else if (sayi > maks) {
                    maks = sayi;
                } else if (sayi < min) {
                    min = sayi;
                }
                toplam = toplam + sayi;
                a = toplam / 10;
            }
            System.out.println("En büyük sayı: " + maks);
            System.out.println("En küçük sayı: " + min);
            System.out.println("Ortalama: " + a);

        }
    }
}
