import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // '-' 기준으로 문자열을 분리
        String[] s = br.readLine().split("-");

        // 첫 번째 부분은 모두 더함 (제일 앞쪽에 오는 덧셈 연산들)
        int num = 0;
        for (String add : s[0].split("\\+")) {
            num += Integer.parseInt(add);
        }

        // 그 이후의 부분들은 각각 더해서 모두 빼줌
        for (int i = 1; i < s.length; i++) {
            int sum = 0;
            for (String add : s[i].split("\\+")) {
                sum += Integer.parseInt(add);
            }
            num -= sum;
        }

        bw.write(num + "\n");
        bw.close();
    }
}
