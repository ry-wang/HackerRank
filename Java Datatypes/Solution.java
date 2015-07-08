import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
     */
    
    Scanner userInput = new Scanner(System.in);
    int testCases = userInput.nextInt();
    String [] num = new String[testCases];
    
    double minI = Math.pow(-2, 31);
    double maxI = (Math.pow(2, 31)) - 1;
    
    double minLong = Math.pow(-2, 63);
    double maxLong = (Math.pow(2, 63)) - 1;

    for (int i = 0; i < testCases; i++) {
      num[i] = userInput.next();
    }
    
    for (int k = 0; k < num.length; k++) {
      try {
        long test = Long.valueOf(num[k]);
        System.out.println(num[k] + " can be fitted in: ");
        if ((test >= -128) && (test <= 127)) {
          System.out.println("* byte");
        }
        if ((test >= -32768) && (test <= 32767)) {
          System.out.println("* short");
        }
        if ((test >= minI) && (test <= maxI)) {
          System.out.println("* int");
        }
        if ((test >= minLong) && (test <= maxLong)) {
          System.out.println("* long");
        }
      }
      catch (NumberFormatException e) {
        System.out.println(num[k] + " can't be fitted anywhere.");
      }
    }
    
  }
}