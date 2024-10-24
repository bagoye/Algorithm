import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int l = Integer.parseInt(br.readLine());
        int[] arr = new int[l];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int n = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int s = 0, e = 0;

        // n이 arr의 범위 내에서 어디에 위치하는지 확인
        if (arr[0] > n) {
            // n이 arr의 첫 번째 값보다 작은 경우
            s = 0;
            e = arr[0];
        } else {
            for (int i = 0; i < l - 1; i++) {
                // n이 이미 arr에 있는 경우
                if (arr[i] == n || arr[i + 1] == n) {
                    bw.write("0\n");
                    bw.flush();
                    bw.close();
                    return;
                }

                // n이 arr[i]와 arr[i+1] 사이에 있는 경우
                if (arr[i] < n && arr[i + 1] > n) {
                    s = arr[i];
                    e = arr[i + 1];
                    break;
                }
            }
        }

        // n을 포함하는 구간의 개수 계산
        int left = n - s - 1;  // n의 왼쪽 구간 (s와 n 사이)
        int right = e - n - 1; // n의 오른쪽 구간 (n과 e 사이)

        // 가능한 구간 수: 왼쪽 구간, 오른쪽 구간, 왼쪽+오른쪽 구간
        int answer = left + right + (left * right);

        bw.write(answer + "\n");
        bw.close();
    }
}
