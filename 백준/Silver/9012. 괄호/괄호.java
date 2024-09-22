import java.io.*;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            String answer = "YES";

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()) answer = "NO";
            
            bw.write(answer + "\n");
        }
        bw.close();
    }
}
