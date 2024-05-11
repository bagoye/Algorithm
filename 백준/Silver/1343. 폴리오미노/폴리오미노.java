import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String result = "";
        result = poliomino(s);
        System.out.println(result);
    }

    public static String poliomino(String s) {
        String ans = "";
        String A = "AAAA", B = "BB";
        s = s.replaceAll("XXXX", A);
        ans = s.replaceAll("XX", B);

        if (ans.contains("X")) {
            ans = "-1";
        }

        return ans;
    }
}
