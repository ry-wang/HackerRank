import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner userInput = new Scanner(System.in);
        int n = Integer.parseInt(userInput.nextLine());
        long sum = 0;
        String [] array;
        String tempData = userInput.nextLine();
        array = tempData.split(" ");
        
        for (int i = 0; i < n; i++) {
            sum += Long.parseLong(array[i]);
        }
        
        System.out.println(sum);
        
    }
}