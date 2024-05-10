import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int v = input.nextInt();

        int day = (v - b) / (a - b);

        if ((v - b) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
