import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] cur = br.readLine().split(":");
        int curHour = Integer.parseInt(cur[0]);
        int curMin = Integer.parseInt(cur[1]);
        int curSec = Integer.parseInt(cur[2]);
        int curSecAmount = curHour * 3600 + curMin * 60 + curSec;

        String[] drop = br.readLine().split(":");
        int dropHour = Integer.parseInt(drop[0]);
        int dropMin = Integer.parseInt(drop[1]);
        int dropSec = Integer.parseInt(drop[2]);
        int dropSecAmount = dropHour * 3600 + dropMin * 60 + dropSec;

        int need = dropSecAmount - curSecAmount;
        if (need <= 0) need += 24 * 3600;

        int needHour = need / 3600;
        int needMin = (need % 3600) / 60;
        int needSec = need % 60;
        bw.write(String.format("%02d:%02d:%02d", needHour, needMin, needSec));
        bw.close();
    }
}
