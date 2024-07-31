
import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {
        int a = 0;
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("1. Sayı gir :");
            int sayi = klavye.nextInt();

            System.out.print("2. Sayı gir :");

            int sayi2 = klavye.nextInt();
            // sayi 1 kadar 0'a sayi 2 den ekle.
            for (int i = 1; i <= sayi; i++) {
                a += sayi2;

            }
        }
        System.out.println("Sonuç :" + a);
    }
}
