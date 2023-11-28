import java.util.Scanner;

public class Main {
    static int[][] fingerGraph = new int[6][6];
    static int n;

    static boolean isPricked(int start) {
        for (int i = 1; i <= 5; i++) {
            if (fingerGraph[start][i] == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0, a, b; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            fingerGraph[a][b] = 1;
        }

        if ((fingerGraph[1][3] == 1 || fingerGraph[3][1] == 1) &&
            (fingerGraph[1][4] == 1 || fingerGraph[4][1] == 1) &&
            (fingerGraph[3][4] == 1 || fingerGraph[4][3] == 1) &&
            isPricked(2) && isPricked(5)) {
            System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
        } else {
            System.out.println("Woof-meow-tweet-squeek");
        }
    }
}