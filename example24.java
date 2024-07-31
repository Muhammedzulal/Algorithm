public class example24 {
    public static int faktor(int i) {
        if (i == 0) {
            return 1;
        } else {
            return i * faktor(i - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println(faktor(5));
    }
}
