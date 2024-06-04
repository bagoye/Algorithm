import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int arrSum = 0;
        for (int i = 0; i < 9; i++) {
            arrSum += arr[i];
        }

        boolean found = false;
        for (int i = 0; i < 9 && !found; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (arrSum - arr[i] - arr[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        bw.write(arr[k] + "\n");
                    }
                    found = true; // 찾았으니 반복문 종료
                    break;
                }
            }
        }
        bw.close();
    }
}
