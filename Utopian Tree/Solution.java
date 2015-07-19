import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    int T = Integer.parseInt(input.nextLine());
    int height = 1;
    int [] finalHeight = new int [T];
    
    //For each tree
    for (int i = 0; i < T; i++) {
      height = 1;
      int N = Integer.parseInt(input.nextLine());
      if (N > 0) {
        for (int k = 0; k < N; k++) {
          if ((k % 2) == 0) {
            height = height * 2;
          }
          else {
            height +=1;
          }
        }
      }
      finalHeight[i] = height;
    }
    
    for (int q = 0; q < T; q++) {
      System.out.println(finalHeight[q]);
    }
    
    
  }
}