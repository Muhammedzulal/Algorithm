import java.util.Scanner;

public class example16 {
    public static void main(String[] args) {
        int dizi[] = { 60, 80, 55, 42, 13, 24, 26, 25, 26, 55, 45, 50, 50, 40 };
        try (Scanner keyboard = new Scanner(System.in)) {
            int total = 0;
            System.out.print("Sayınızı giriniz :");
            int sayi = keyboard.nextInt();
            for (int i = 0; i < dizi.length; i++) {
                if (sayi == dizi[i]) {
                    total = total + 1;
                }

            }
            System.out.println(total);
        }
    }
}
