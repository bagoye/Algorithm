import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        long[] cards = new long[n];

        for (int i = 0; i < n; i++) {
            cards[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(cards);
            long sum = cards[0] + cards[1];
            cards[0] = sum;
            cards[1] = sum;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cards[i];
        }

        System.out.println(sum);
    }
}
