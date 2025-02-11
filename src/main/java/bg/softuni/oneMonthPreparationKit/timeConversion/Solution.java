package bg.softuni.oneMonthPreparationKit.timeConversion;

import java.util.Scanner;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String input) {
        int hour = Integer.parseInt(input.substring(0, 2));
        String minutes = input.substring(3, 8);
        String period = input.substring(8);

        if (period.equals("PM") && hour != 12) {
            hour += 12;
        } else if (period.equals("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%s", hour, minutes);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String result = Result.timeConversion(line);
        System.out.println(result);
    }
}
