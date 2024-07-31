public class example25 {
    public static int fibonacci(int i) {
        if (i == 1) {
            return 1;
        }
        return i + fibonacci(i - 1);
    }

    public static void main(String[] args) {
        int i = 2;
        System.out.println(i);
    }
}
