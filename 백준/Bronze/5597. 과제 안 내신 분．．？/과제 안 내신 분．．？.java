import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] students = new int[31];

        for (int i = 1; i < 29; i++) {
            int n = Integer.parseInt(br.readLine());
            students[n] = 1;
        }
        for (int i = 1; i < students.length; i++) {
            if (students[i] != 1) {
                bw.write(i + "\n");
            }
        }
        bw.close();
    }
}
