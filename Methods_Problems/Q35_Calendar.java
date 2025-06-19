import java.util.Scanner;

public class Q35_Calendar {
    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                              "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getStartDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        if (m < 1 || m > 12) return;

        if (m == 2 && isLeapYear(y)) days[1] = 29;

        System.out.println("   " + months[m - 1] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int start = getStartDay(m, y);

        for (int i = 0; i < start; i++) System.out.print("   ");
        for (int d = 1; d <= days[m - 1]; d++) {
            System.out.printf("%2d ", d);
            if ((start + d) % 7 == 0) System.out.println();
        }
    }
}
