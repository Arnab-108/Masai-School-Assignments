import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int ans = calculateSquareRoot(n);
            System.out.println(ans);
        }
    }

    private static int calculateSquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long x = n;
        while (x * x > n) {
            x = (x + n / x) / 2;
        }

        return (int) x;
    }
}
