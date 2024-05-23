import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            if (firstAbs == secondAbs) { // 절댓값 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return firstAbs - secondAbs; // 절댓값 작은 데이터 우선
        });

        for (int i = 0; i < n; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (q.isEmpty()) {
                    bw.write("0" + "\n");
                } else {
                    bw.write(q.poll().toString() + "\n");
                }
            } else {
                q.add(request);
            }
        }
        bw.close();

    }
}
