import java.io.*;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                arr.add(n);
            }
        }

        if (arr.isEmpty()) {
            bw.write("-1");
        } else {
            int sum = 0;
            int min = arr.get(0);

            for (int num : arr) {
                sum += num;
                if (num < min) {
                    min = num;
                }
            }
            bw.write(sum + "\n");
            bw.write(min + "");
        }
        bw.close();
    }
}
