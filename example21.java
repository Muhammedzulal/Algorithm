public class example21 {
    public static void main(String[] args) {
        int sayac1 = 0, sayac2 = 0, sayac3 = 0, sayac4 = 0, sayac5 = 0;
        
        char dizi1[] = { 'A', 'B', 'C', 'D', 'D', 'C', 'B', 'A', 'A', 'B' };
        char dizi2[] = { 'B', 'A', 'A', 'B', 'B', 'A', 'A', 'B', 'C', 'B' };
        char dizi3[] = { 'A', 'B', 'C', 'D', 'B', 'B', 'A', 'A', 'C', 'B' };
        char dizi4[] = { 'B', 'A', 'A', 'B', 'B', 'A', 'A', 'B', 'A', 'A' };
        char dizi5[] = { 'D', 'D', 'C', 'B', 'B', 'A', 'A', 'A', 'B', 'A' };
        char dizicevap[] = { 'D', 'D', 'C', 'B', 'B', 'A', 'A', 'A', 'B', 'A' };
        for (int i = 0; i < 10; i++)
            if (dizicevap[i] == dizi1[i]) {
                sayac1++;
            }
        for (int i = 0; i < 10; i++)
            if (dizicevap[i] == dizi2[i]) {
                sayac2++;
            }
        for (int i = 0; i < 10; i++)
            if (dizicevap[i] == dizi3[i]) {
                sayac3++;
            }
        for (int i = 0; i < 10; i++)
            if (dizicevap[i] == dizi4[i]) {
                sayac4++;
            }
        for (int i = 0; i < 10; i++)
            if (dizicevap[i] == dizi5[i]) {
                sayac5++;
            }
        System.out.println("1.nin " + sayac1 + "  Doğrusu var.");
        System.out.println("2.nin " + sayac2 + "  Doğrusu var.");
        System.out.println("3.nün " + sayac3 + "  Doğrusu var.");
        System.out.println("4.nün " + sayac4 + "  Doğrusu var.");
        System.out.println("5.nin " + sayac5 + " Doğrusu var.");
    }
}
