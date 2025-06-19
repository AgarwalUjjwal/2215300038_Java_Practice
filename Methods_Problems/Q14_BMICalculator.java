import java.util.Scanner;

public class Q14_BMICalculator {
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInM * heightInM);
        }
        return data;
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }
        calculateBMI(data);
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + data[i][0] + ", Height: " + data[i][1] + ", BMI: " + data[i][2] + ", Status: " + getStatus(data[i][2]));
        }
    }
}
