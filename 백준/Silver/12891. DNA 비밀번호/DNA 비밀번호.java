import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static int baseToIndex(char alp) {
        if (alp == 'A') return 0;
        else if (alp == 'C') return 1;
        else if (alp == 'G') return 2;
        else if (alp == 'T') return 3;
        return -1;
    }

    public static boolean isValid(int[] cnt, int[] minCnt) {
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] < minCnt[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        int[] minCnt = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minCnt[i] = Integer.parseInt(st.nextToken());
        }

        int[] cnt = new int[4];
        for (int i = 0; i < p - 1; i++) {
            cnt[baseToIndex(arr[i])]++;
        }
        int answer = 0;

        for (int i = p - 1; i < s; i++) {
            cnt[baseToIndex(arr[i])]++;
            if (isValid(cnt, minCnt)) answer++;
            cnt[baseToIndex(arr[i - p + 1])]--;
        }

        bw.write(answer + "");
        bw.close();
    }
}
