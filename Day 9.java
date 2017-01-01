import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int input) {
    	if (input == 1) {
    		return 1;
    	} else {
    		return input * factorial(input - 1);
    	}
    }
}