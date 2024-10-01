import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        // 1. k보다 작은 삼각수 모두 구하기
        int[] nums = new int[50];
        int cnt = 0;
        for (int i = 1; ; i++) {
            int num = i * (i + 1) / 2;
            if (num >= 1000) break;
            nums[cnt++] = num;
        }

        // 2. 구해진 삼각수 세개의 합으로 k를 나타낼 수 있는지 확인
        boolean[] sumNum = new boolean[1001];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                int sum = nums[i] + nums[j];
                if (sum < 1000) sumNum[sum] = true;
            }
        }

        for (int i = 1; i < 1000; i++) {
            if (!sumNum[i]) continue;
            for (int j = 0; j < cnt; j++) {
                int sum = i + nums[j];
                if (sum <= 1000) isEurekaNumber[sum] = true;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        preprocess();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            bw.write(isEurekaNumber[k] ? "1\n" : "0\n");
        }
        bw.close();
    }
}
