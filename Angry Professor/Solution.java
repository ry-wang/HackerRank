import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int testNumCases = Integer.parseInt(input.nextLine());
        
        int totalStudents;
        int wantedStudents;
        String [] results = new String[testNumCases];
        
        int resultStage = 0;
        String tempData;
        String [] tempArray;
        
        int onTime = 0;
        int late = 0;
        
        for (int k = 0; k < testNumCases; k++) {
            onTime = 0;
            late = 0;
            tempData = input.nextLine();
            tempArray = tempData.split(" ");
            totalStudents = Integer.parseInt(tempArray[0]);
            wantedStudents = Integer.parseInt(tempArray[1]);
            tempData = input.nextLine();
            tempArray = tempData.split(" ");
        
            for (int i = 0; i < totalStudents; i++) {
                if (Integer.parseInt(tempArray[i]) <= 0) {
                    onTime++;
                }
                else {
                    late++;
                }
            }
            if (onTime < wantedStudents) {
                results[k] = "YES";
            }
            else {
                results[k] = "NO";   
            }
        }
        
        for (int k = 0; k < results.length; k++) {
            System.out.println(results[k]);
        }
        
    }
}