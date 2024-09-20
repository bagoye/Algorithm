import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        str = str.trim();
        String[] arr = str.split(" ");
        if (str.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}
