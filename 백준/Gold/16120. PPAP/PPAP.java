import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);

            // 스택에 "PPAP" 패턴이 쌓이면 "P"로 변환
            if (stack.size() >= 4 && stack.get(stack.size() - 1) == 'P' &&
                    stack.get(stack.size() - 2) == 'A' &&
                    stack.get(stack.size() - 3) == 'P' &&
                    stack.get(stack.size() - 4) == 'P') {

                // "PPAP" 문자열을 "P"로 대체
                stack.pop(); // P
                stack.pop(); // A
                stack.pop(); // P
                // 마지막 남은 P는 유지
            }
        }

        if (stack.size() == 1 && stack.peek() == 'P') bw.write("PPAP\n");
        else bw.write("NP\n");

        bw.close();
    }
}
