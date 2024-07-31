
public class example3 {
    public static void main(String[] args) {
        int x = 10, y = 10, z = 0;
        char a = 65, b = 66;
        if (x == y)
            z = 5;
        if (x > z)
            a = 'C';
        if (x > y)
            y = 4;
        z = 10;
        if (!(x > z))
            x = 7;
        if (b <= a)
            a = 67;
        if (x != y)
            y = x / 2;

        System.out.printf("x=%d y=%d z=%d \n", x, y, z);
    }
}
