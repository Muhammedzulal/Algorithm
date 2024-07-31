import java.util.Scanner;

public class example17 {
    public static void main(String[] args) {
        char dizi[] = { 'a', 'e', 'u', 'ü', 'o', 'ö', 'i' };
        try (Scanner keyboard = new Scanner(System.in)) {
            int sayac1 = 0;
            System.out.print("Kelime giriniz :");
            String kelime = keyboard.nextLine();

            for (int j = 0; j < kelime.length(); j++) {
                for (int i = 0; i < dizi.length; i++) {
                    if (kelime.charAt(j) == dizi[i]) {
                        sayac1++;
                    }
                }
            }
            System.out.println(sayac1 + " tane sesli harf var");
        }
    }
}
