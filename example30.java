import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class example30 {
    public static void main(String[] args) {
        File dosya = new File("C:\\JavaLanguage\\data.txt");
        File f1 = new File("C:\\JavaLanguage\\gecen.txt");
        File f2 = new File("C:\\JavaLanguage\\kalanlar.txt");

        try {
            Scanner s = new Scanner(dosya);
            PrintWriter pw1 = new PrintWriter(f1);
            PrintWriter pw2 = new PrintWriter(f2);
            while (s.hasNext()) {
                int numara = s.nextInt();
                String isim = s.next();
                String sod = s.next();
                int not1 = s.nextInt();
                int not2 = s.nextInt();
                int not3 = s.nextInt();
                double hesap = (double) ((not1 * 40 / 100) + (not2 * 60 / 100));
                if (hesap >= 50 && not2 >= 50) {
                    pw1.println(numara + " " + isim + " " + sod + " " + not1 + " " + not2 + " " + not3);
                } else {
                    double hesap2 = (double) ((not1 * 40 / 100) + (not3 * 60 / 100));
                    if (hesap2 >= 50 && not3 >= 50)
                        pw1.println(numara + " " + isim + " " + sod + " " + not1 + " " + not2 + " " + not3);
                    else
                        pw2.println(numara + " " + isim + " " + sod + " " + not1 + " " + not2 + " " + not3);
                }

            }
            System.out.println("Dosyalar dolduruldu!");

            s.close();
            pw1.close();
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
            e.printStackTrace();
        }
    }
}
