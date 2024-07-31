
import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("İlk sayıyı giriniz :");
            int a = klavye.nextInt();
            System.out.print("Son sayıyı giriniz :");
            int b = klavye.nextInt();
            System.out.print("Bölen sayıyı giriniz :");
            int c = klavye.nextInt();
            int toplam = 0;
            for (int i = a; i <= b; i++) {
                if (i % c == 0) {
                    System.out.println(i);
                    toplam = toplam + i;
                }

            }

            System.out.println("toplam = " + toplam);
        }
    }
}
