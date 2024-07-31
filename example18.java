
import java.util.Scanner;

public class example18 {
    public static void main(String[] args) {
        double white = 0;
        double red = 0;
        double yellow = 0;
        double green = 0;
        double purple = 0;
        

        System.out.println("___________________________");
        System.out.println("Siyasi partiler aşağıdaki gibidir ; ");
        System.out.println("___________________________");
        System.out.println("Beyaz Parti   Kırmızı Parti  Sarı Parti   Yeşil Parti   Mor Parti");
        String[] parti = { "bp", "kp", "sp", "yp", "mp" };
        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.print("Kaç kez oy vermek istersiniz? :");
            int oysayisi = keyboard.nextInt();
            System.out.println("Oy vermek istediğiniz partinin baş harflerini yazınız (beyaz parti: bp)");
            for (int i = 0; i <= oysayisi; i++) {

                String party = keyboard.nextLine();
                if (party.equals(parti[0])) {
                    white++;

                }
                if (party.equals(parti[1])) {
                    red++;

                }
                if (party.equals(parti[2])) {
                    yellow++;

                }
                if (party.equals(parti[3])) {
                    green++;

                }
                if (party.equals(parti[4])) {
                    purple++;

                }
            }
            System.out.println("Beyaz Parti oyları: " + white + "     %" + (white / oysayisi) * 100);
            System.out.println("Kırmızı Parti oyları: " + red + "     %" + (red / oysayisi) * 100);
            System.out.println("Sarı Parti oyları: " + yellow + "     %" + (yellow / oysayisi) * 100);
            System.out.println("Yeşil Parti oyları: " + green + "     %" + (green / oysayisi) * 100);
            System.out.println("Mor Parti oyları: " + purple + "     %" + (purple / oysayisi) * 100);
        }
    }
}
