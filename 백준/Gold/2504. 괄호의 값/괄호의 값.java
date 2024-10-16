import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int delimiterToValue(char delimiter) {
        if (delimiter == '(' || delimiter == ')') return 2;
        else if (delimiter == '[' || delimiter == ']') return 3;
        return -1;
    }

    public static void main (String[] args) throws IOException {
        char[] arr = br.readLine().toCharArray();

        int[] stack = new int[arr.length];
        int idx = -1;
        int curr = 1;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int delimiterValue = delimiterToValue(arr[i]);
            if (arr[i] == '(' || arr[i] == '[') {
                stack[++idx] = delimiterValue;
                curr *= delimiterValue;
            }
            else {
                if (idx < 0 || stack[idx--] != delimiterValue) {
                    answer = 0;
                    break;
                }
                if (arr[i - 1] == '(' || arr[i - 1] == '[')
                    answer += curr;
                curr /= delimiterValue;
            }
        }
        bw.write(idx < 0 ? answer + "" : "0");
        bw.close();
    }

}
