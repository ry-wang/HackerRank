import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner userInput = new Scanner(System.in);
        int stairLength = Integer.parseInt(userInput.nextLine());
        int stairWidth = stairLength;
        int timesRun = 1;
        
        for (int i = 0; i < stairLength; i++) {
            for (int k = 0; k < (stairWidth - timesRun); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < timesRun; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            timesRun++;
        }
    }
}