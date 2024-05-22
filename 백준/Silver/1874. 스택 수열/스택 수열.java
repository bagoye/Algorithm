import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuffer bf = new StringBuffer();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> s = new Stack<>();
        int num = 1;
        boolean result = true;

        for (int i = 0; i < a.length; i++) {
            int su = a[i];
            if (su >= num) {
                while (su >= num) {
                    s.push(num++);
                    bf.append("+\n");
                }
                s.pop();
                bf.append("-\n");
            } else {
                int n = s.pop();
                if (n > su) {
                    bw.write("NO");
                    result = false;
                    break;
                } else{
                    bf.append("-\n");
                }
            }
        }

        if (result) {
            bw.write(bf.toString());
        }
        bw.close();

    }
}

