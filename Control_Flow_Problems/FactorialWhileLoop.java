import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0) {
            int fact = 1, i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
