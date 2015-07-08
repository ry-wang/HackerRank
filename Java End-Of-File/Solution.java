import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner userInput = new Scanner(System.in);
    int lineNum = 1;    
    
    while (userInput.hasNextLine() == true) {
    if (userInput.hasNext() == true) {
        System.out.println(lineNum + " " + userInput.nextLine());
        lineNum++;
    }
    }
    
    }
}