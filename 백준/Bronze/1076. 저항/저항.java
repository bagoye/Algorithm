import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long answer = (getIndex(color, a) * 10) + getIndex(color, b);
        answer *= Math.pow(10, getIndex(color, c));

        bw.write(answer + "");
        bw.close();
    }

    public static int getIndex(String[] color, String value) {
        for (int i = 0; i < color.length; i++) {
            if (color[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
