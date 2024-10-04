import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static class Message {
        int num;
        int idx;

        Message(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    static class Frequency {
        int num;
        int cnt;
        int firstIdx;

        Frequency(int num, int cnt, int firstIdx) {
            this.num = num;
            this.cnt = cnt;
            this.firstIdx = firstIdx;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        Message[] messages = new Message[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) messages[i] = new Message(Integer.parseInt(st.nextToken()), i);

        Arrays.sort(messages, new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o1.num - o2.num;
            }
        });

        Frequency[] frequencies = new Frequency[n];
        int frequencyIdx = 0;
        frequencies[frequencyIdx] = new Frequency(messages[0].num, 1, messages[0].idx);
        for (int i = 1; i < n; i++) {
            if (messages[i].num != messages[i - 1].num) {
                frequencies[++frequencyIdx] = new Frequency(messages[i].num, 0, messages[i].idx);
            }
            frequencies[frequencyIdx].cnt++;
        }

        Arrays.sort(frequencies, 0, frequencyIdx + 1, new Comparator<Frequency>() {
            @Override
            public int compare(Frequency o1, Frequency o2) {
                if (o1.cnt == o2.cnt) return o1.firstIdx - o2.firstIdx;
                return o2.cnt - o1.cnt;
            }
        });

        for (int i = 0; i <= frequencyIdx; i++) {
            while (frequencies[i].cnt-- > 0) {
                bw.write(frequencies[i].num + " ");
            }
        }
        bw.close();
    }
}
