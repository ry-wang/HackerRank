import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int factorial = input.nextInt();
        BigInteger product = BigInteger.valueOf(factorial);
        
        for (int i = (factorial - 1); i > 0; i--) {
            product = product.multiply((BigInteger.valueOf(i)));
        }
        
        System.out.println(product);
    }
}