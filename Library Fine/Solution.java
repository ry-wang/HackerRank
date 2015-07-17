import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner input = new Scanner(System.in);
      
      //Actual return day
      String tempData = input.nextLine();
      String [] tempArray = tempData.split(" ");
      
      int actualReturnDay = Integer.parseInt(tempArray[0]);
      int actualReturnMonth = Integer.parseInt(tempArray[1]);
      int actualReturnYear = Integer.parseInt(tempArray[2]);
      
      //Expected Return Day
      tempData = input.nextLine();
      tempArray = tempData.split(" ");
      
      int expectedReturnDay = Integer.parseInt(tempArray[0]);
      int expectedReturnMonth = Integer.parseInt(tempArray[1]);
      int expectedReturnYear = Integer.parseInt(tempArray[2]);
      
      int fine = 0;
      
      if ((actualReturnDay <= expectedReturnDay) && (actualReturnMonth <= expectedReturnMonth) && (actualReturnYear <= expectedReturnYear)) {
        fine = 0;
      }
      if (expectedReturnMonth == actualReturnMonth) {
        if (actualReturnDay > expectedReturnDay) {
          fine = (15*(actualReturnDay - expectedReturnDay));
        }
      }
      if (expectedReturnYear == actualReturnYear) {
        if (actualReturnMonth > expectedReturnMonth) {
          fine = (500*(actualReturnMonth - expectedReturnMonth));
        }
      }
      if (actualReturnYear > expectedReturnYear) {
        fine = 10000;
      }
      
      System.out.println(fine);
    }
}