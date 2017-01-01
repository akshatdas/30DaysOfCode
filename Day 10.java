import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> binaryNums = new ArrayList<>();

        // Convert Initial input into Binary Representation
        while (n > 0) {
            int remainder = n % 2;
            n /= 2;
            binaryNums.add(0, remainder);
        }


        // Find maximum number of consecutive 1's.
        int max = 0;
        int temp = 0;
        for (int k = 0; k < binaryNums.size(); k++) {
            int digit = binaryNums.get(k);
            if (digit == 1) {
                temp++;
                max = Math.max(max, temp);
            } else if (digit == 0) {
                temp = 0;
            }
        }
        System.out.println(max);
    }
}