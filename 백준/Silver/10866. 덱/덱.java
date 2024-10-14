import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();

        while (n-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push_front")) {
                dq.offerFirst(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("push_back")) {
                dq.offerLast(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop_front")) {
                bw.write(dq.isEmpty() ? "-1\n" : dq.pollFirst() + "\n");
            } else if (cmd[0].equals("pop_back")) {
                bw.write(dq.isEmpty() ? "-1\n" : dq.pollLast() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(dq.size() + "\n");
            } else if (cmd[0].equals("empty")) {
                bw.write(dq.isEmpty() ? "1\n" : "0\n");
            } else if (cmd[0].equals("front")) {
                bw.write(dq.isEmpty() ? "-1\n" : dq.getFirst() + "\n");
            } else if (cmd[0].equals("back")) {
                bw.write(dq.isEmpty() ? "-1\n" : dq.getLast() + "\n");
            }
        }
        bw.close();
    }
}
