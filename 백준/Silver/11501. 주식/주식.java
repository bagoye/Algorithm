import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            long profit = 0;
            long maxPrice = 0;

            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j] > maxPrice) {
                    maxPrice = arr[j];
                } else {
                    profit += maxPrice - arr[j];
                }
            }
            System.out.println(profit);
        }

    }
}
