import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int val = n;
        // set1: 처음 등장한 수 저장, set2: 반복되는 수 저장
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        while (true) {
            val = (val * n) % p;
            // 만약 set1에 val이 이미 존재한다면
            if (!set1.add(val)) {
                // set2에도 존재한다면
                if (!set2.add(val)) {
                    // 반복되는 수를 모두 찾았으니까 루프 종료
                    break;
                }
            }
        }

        bw.write(set2.size() + "");
        bw.close();

    }
}