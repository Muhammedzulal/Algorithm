
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("bir sayı giriniz :");
            int yas = klavye.nextInt();
            if (yas > 23) {
                System.out.println("23 den büyük");

            } else if (yas == 23) {
                System.out.println("23 e eşit");
            } else {
                System.out.println("23 den küçük");
            }
        }

    }
}
