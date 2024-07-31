
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        int toplam = 1;
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("Bir sayı giriniz :");
            int sayi = klavye.nextInt();
            for (int i = 1; i <= sayi; i++) {
                toplam = toplam * i;

            }
            System.out.println(toplam);
        }
    }
}
