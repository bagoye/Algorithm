import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int s = 0, e = 0;
        int answer = 0;

        int temp = arr[s];
        while (e < n && s <= e) {
            int min = Math.min(temp, sum - temp);
            answer = Math.max(answer, min);

            if (temp == min) {
                e++;
                temp += arr[e];
            } else {
                temp -= arr[s];
                s++;
            }
        }

        bw.write(answer + "");
        bw.close();


    }
}
