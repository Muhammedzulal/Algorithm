import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Öğrenci sayısını giriniz :");
            int number = keyboard.nextInt();
            int arrays[] = new int[number];
            int eniyi = 0;
            for (int i = 0; i < number; i++) {
                System.out.print((i + 1) + ". Notu giriniz:");
                int number2 = keyboard.nextInt();

                arrays[i] = number2;

                if (arrays[i] > eniyi) {
                    eniyi = arrays[i];
                }

            }

            for (int j = 0; j < number; j++) {
                System.out.println("Öğrenci " + (j + 1) + "'in notu :" + arrays[j]);

            }

        }
    }
}
