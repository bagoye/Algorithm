import java.io.*;
import java.util.Stack;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Stack<Character> password = new Stack<>();
            Stack<Character> delete = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp == '<') {
                    if (!password.isEmpty()) delete.push(password.pop());
                } else if (temp == '>') {
                    if (!delete.isEmpty()) password.push(delete.pop());
                } else if (temp == '-') {
                    if (!password.isEmpty()) password.pop();
                } else password.push(s.charAt(i));
            }

            while (!delete.isEmpty()) {
                password.push(delete.pop());
            }

            for (int i = 0; i < password.size(); i++) {
                bw.write(password.get(i));
            }
            bw.write('\n');

        }
        bw.close();
    }
}
