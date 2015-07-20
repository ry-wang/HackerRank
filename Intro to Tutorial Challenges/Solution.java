import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int V = Integer.parseInt(input.nextLine());
        int arrayLength = Integer.parseInt(input.nextLine());
        int [] array = new int[arrayLength];
        
        String arrayInput = input.nextLine();
        String [] tempArray = arrayInput.split(" ");
        
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Integer.parseInt(tempArray[i]);
        }
        
        for (int i = 0; i < arrayLength; i++) {
           if (array[i] == V) {
               System.out.println(i);
           }
        }
    }
}