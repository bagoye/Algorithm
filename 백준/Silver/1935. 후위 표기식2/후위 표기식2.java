import java.io.*;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Stack<Double> stack = new Stack<>();
        double answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') stack.push(arr[s.charAt(i) - 'A']);
            else {
                if (!stack.isEmpty()) {
                    double d1 = stack.pop();
                    double d2 = stack.pop();
                    switch (s.charAt(i)) {
                        case '+' :
                            answer = d1 + d2;
                            stack.push(answer);
                            continue;
                        case '-':
                            answer = d2 - d1;
                            stack.push(answer);
                            continue;
                        case '*':
                            answer = d1 * d2;
                            stack.push(answer);
                            continue;
                        case '/':
                            answer = d2 / d1;
                            stack.push(answer);
                            continue;
                    }
                }
            }
        }
        bw.write(String.format("%.2f", stack.pop()));
        bw.close();
    }
}
