
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        try (Scanner klavye = new Scanner(System.in)) {
            System.out.print("Kullanıcı Adınızı Giriniz :");
            String kullanici = klavye.nextLine();
            String abcd = "abcd";
            if (kullanici.equals(abcd)) {
                System.out.println("Doğru");
            }
        }
    }
}
