import java.util.Scanner;

public class OddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}