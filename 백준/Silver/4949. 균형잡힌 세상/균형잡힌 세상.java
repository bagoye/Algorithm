import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            String words = br.readLine();
            Stack<Character> s = new Stack<>();

            if (words.equals(".")) {
                break;
            }

            for (int i = 0; i < words.length(); i++) {
                char ch = words.charAt(i);

                if (ch == '(' || ch == '[') {
                    s.push(ch);
                } else if (ch == ')') {
                    if (!s.isEmpty() && s.peek() == '(') {
                        s.pop();
                    } else {
                        s.push(ch);
                        break;
                    }
                } else if (ch == ']') {
                    if (!s.isEmpty() && s.peek() == '[') {
                        s.pop();
                    } else {
                        s.push(ch);
                        break;
                    }
                }
            }

            if (s.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.close();
    }
}
