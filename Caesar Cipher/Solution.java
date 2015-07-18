import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in); 
    int textLength = Integer.parseInt(input.nextLine());
    String text = input.nextLine();
    int shiftNum = Integer.parseInt(input.nextLine());
    int charStatus = 0;
    
    
    for (int i = 0; i < textLength; i++) {
      char c = text.charAt(i);
      if ((((int) c >= 65) && ((int) c <= 90)) || (((int) c >= 97) && ((int) c <= 122))) {
        //uppercase
        if (((int) c >= 65) && ((int) c <= 90)) {
          charStatus = 1;
        }
        //lowercase
        else if (((int) c >= 97) && ((int) c <= 122)) {
          charStatus = 2;
        }
        for (int k = 0; k < shiftNum; k++) {
          c++;
          if (charStatus == 1) {
            if (c > 90) {
              c = 65;
            }
          }
          else if (charStatus == 2) {
            if (c > 122) {
              c = 97;
            }
          }
        }
      }
      System.out.print(c);
    }
    
  }
  
}
