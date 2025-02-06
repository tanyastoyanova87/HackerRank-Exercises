package bg.softuni.plusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int all = arr.size();

        for (int num : arr) {
            if (num < 0) {
                negative++;
            } else if (num > 0) {
                positive++;
            } else {
                zeros++;
            }
        }

        System.out.printf("%.6f%n", (double) positive / all);
        System.out.printf("%.6f%n", (double) negative / all);
        System.out.printf("%.6f%n", (double) zeros / all);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
