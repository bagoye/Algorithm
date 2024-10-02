import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2[0].compareTo(o1[0]);
            }
        });

        for (int i = 0; i < n - 1; i++) {
            if (arr[i][1].equals("enter") && !arr[i][0].equals(arr[i + 1][0])) {
                bw.write(arr[i][0] + "\n");
            }
        }
        if (arr[n - 1][1].equals("enter")) bw.write(arr[n - 1][0]);
        bw.close();
    }
}
