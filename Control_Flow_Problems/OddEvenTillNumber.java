import java.util.Scanner;

public class OddEvenTillNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " Even");
                } else {
                    System.out.println(i + " Odd");
                }
            }
        }
    }
}
