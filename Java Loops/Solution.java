import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner userInput = new Scanner(System.in);
    int numCases;
    numCases = Integer.parseInt(userInput.nextLine());
    int [] a = new int[numCases];
    int [] b = new int[numCases];
    int [] n = new int[numCases];
    int powerNum = 0;
    int sum;
    
    //Sets values
    for (int q = 0; q < numCases; q++) {
      String [] tempArray;
      String tempData;
      tempData = userInput.nextLine();
      tempArray = tempData.split(" ");
      a[q] = Integer.parseInt(tempArray[0]);
      b[q] = Integer.parseInt(tempArray[1]);
      n[q] = Integer.parseInt(tempArray[2]);
      
    }
    
    for (int q = 0; q < numCases; q++) {
      sum = a[q];
      for (int e = 0; e < n[q]; e++) {
        for (int k = 0; k < n[q]; k++) {
          if (powerNum <= (n[q] - 1)) {
            sum += ((Math.pow(2, powerNum)) * b[q]);
             if (powerNum > 0) {
            System.out.print(" " + sum);
            }
            else if (powerNum == 0) {
              System.out.print("" + sum);
            }
            powerNum++;
          }
          k++;
        }
      }
      powerNum = 0;
      sum = 0;
      System.out.print("\n");
    }
    
  }
}