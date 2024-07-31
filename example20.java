import java.util.Scanner;

public class example20 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int total = 0;
            System.out.print("Dizi kaç satır olsun :");
            int satir = keyboard.nextInt();
            System.out.print("Dizi kaç sütun olsun :");
            int sutun = keyboard.nextInt();
            int dizi[][] = new int[satir][sutun];
            for (int i = 0; i < satir; i++) {

                for (int j = 0; j < sutun; j++) {
                    dizi[i][j] = (int) (Math.random() * 100);
                }
            }
            System.out.println("_____DİZİ_____");
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(" ");
                    System.out.printf("%02d ", dizi[i][j]);

                }
                System.out.println(" ");
            }
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    total = total + dizi[i][j];
                }

            }
            System.out.println("____Toplam____");
            System.out.println("     " + total);
        }
    }
}