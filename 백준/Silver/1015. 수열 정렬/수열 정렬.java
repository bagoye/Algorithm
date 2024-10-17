import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static class Elem implements Comparable<Elem> {
        public int num, idx; // num: 배열 A의 값, idx: 원래 인덱스

        Elem(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Elem other) {
            if (num != other.num) return num - other.num; // 값이 다르면 값으로 정렬
            return idx - other.idx; // 값이 같으면 인덱스로 정렬
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Elem[] a = new Elem[n]; // 배열 A의 값과 인덱스를 저장할 배열
        int[] p = new int[n]; // 결과를 저장할 배열 P

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = new Elem(Integer.parseInt(st.nextToken()), i);
        }
 
        // 배열 A를 값 기준으로 정렬
        Arrays.sort(a);

        // 정렬된 배열에서 원래 인덱스를 찾아 P 배열을 구성
        for (int i = 0; i < n; i++) {
            p[a[i].idx] = i;
        }

        for (int i = 0; i < n; i++) {
            bw.write(p[i] + " ");
        }
        bw.close();
    }
}
