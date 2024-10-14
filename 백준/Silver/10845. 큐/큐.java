import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int lastValue = -1;

        while (n-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                lastValue = Integer.parseInt(cmd[1]);
                q.offer(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                bw.write(q.isEmpty() ? "-1\n" : q.poll() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(q.size() + " \n");
            } else if (cmd[0].equals("empty")) {
                bw.write(q.isEmpty() ? "1\n" : "0\n");
            } else if (cmd[0].equals("front")) {
                bw.write(q.isEmpty() ? "-1\n" : q.peek() + "\n");
            } else if (cmd[0].equals("back")) {
                bw.write(q.isEmpty() ? "-1\n" : lastValue + "\n");
            }
        }
        bw.close();
    }
}