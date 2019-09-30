import java.util.Scanner;

public class TimeMin {

    public static void main(String[] args) {
        double[] time = {7.85, 9.4, 7.3, 2.1};
        int len = time.length;
        double min = time[0];
        for (int i = 1; i < len; i++) {
            if (time[i] < min)
                min = time[i];

        }
        System.out.println(min);

    }
}
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter an array of double: ");
        double userArray = input.nextDouble();
        userArray = userArray*/

