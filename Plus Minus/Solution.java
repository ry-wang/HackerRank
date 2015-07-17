import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner userInput = new Scanner(System.in);
        int totalNum = Integer.parseInt(userInput.nextLine());
        String tempData = userInput.nextLine();
        String [] tempArray = tempData.split(" ");
        
        double positiveNum = 0;
        double negativeNum = 0;
        double zeroNum = 0;
        
        for (int i = 0; i < tempArray.length; i++) {
          if (Integer.parseInt(tempArray[i]) > 0) {
            positiveNum++;
          }
          else if (Integer.parseInt(tempArray[i]) < 0) {
            negativeNum++;
          }
          else if (Integer.parseInt(tempArray[i]) == 0) {
            zeroNum++;
          }
        }
        
        System.out.println((positiveNum/totalNum));
        System.out.println((negativeNum/totalNum));
        System.out.println((zeroNum/totalNum));
    }
}