import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int r, c, k;
    static char[][] map;
    static boolean[][] visited;
    static int answer;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        visited[r - 1][0] = true;
        dfs(r - 1, 0, 1);
        
        bw.write(answer + "");
        bw.close();
    }

    public static void dfs(int x, int y, int depth) {
        if (x == 0 && y == c - 1 && depth == k) {
            answer++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < r && ny >= 0 && ny < c && !visited[nx][ny] && map[nx][ny] != 'T') {
                visited[nx][ny] = true;
                dfs(nx, ny, depth + 1);
                visited[nx][ny] = false;
            }
        }
    }

}
