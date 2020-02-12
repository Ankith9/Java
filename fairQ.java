import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

class fairQ
{
    public static void main(final String[] array) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of test cases: ");
        for (int nextInt = scanner.nextInt(), i = 0; i < nextInt; ++i) {
            final int nextInt2 = scanner.nextInt();
            final int[] array2 = new int[nextInt2];
            for (int j = 0; j < nextInt2; ++j) {
                array2[j] = scanner.nextInt();
            }
            minBribe(array2);
        }
    }
    
    static void minBribe(final int[] array) {
        final int[] array2 = array.clone();
        int x = 0;
        for (int i = array2.length; i > 0; --i) {
            if (array2[i - 1] == i + 1) {
                array2[i - 1] = array2[i];
                ++x;
            }
            else if (i >= 2 && array2[i - 2] == i + 1) {
                array2[i - 2] = array2[i - 1];
                array2[i - 1] = array2[i];
                x += 2;
            }
            else if (array2[i] != i + 1) {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(x);
    }
}