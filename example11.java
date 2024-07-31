
public class example11 {
    public static void main(String[] args) {
        int terim = 2;
        int toplam = terim;
        for (int i = 0; i < 99; i++) {

            if (i % 2 == 0)
                terim += 2;
            else
                terim += 4;
            toplam += terim;

        }
        System.out.println(toplam);
    }
}
