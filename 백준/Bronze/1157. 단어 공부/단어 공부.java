import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 'A';
            arr[num]++;
        }

        int max = -1;
        char answer = '?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 65);
            } else if (arr[i] == max) answer = '?';
        }

        bw.write(answer);
        bw.close();
    }
}
