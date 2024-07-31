import java.util.Scanner;

public class example19 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Kaç elemanlı olsun :");
            int elemansayisi = keyboard.nextInt();
            int dizi[] = new int[elemansayisi];
            for (int i = 0; i < elemansayisi; i++) {
                dizi[i] = (int) (50 + Math.random() * 10);
                System.out.print(dizi[i] + " ");
            }

        }
    }
}
