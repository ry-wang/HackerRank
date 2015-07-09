import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner userInput = new Scanner(System.in);
        int entryNum = Integer.parseInt(userInput.nextLine());
        
        String [][] phoneBook = new String[entryNum][2];
        String [] searches = new String[entryNum];
        
        //Adding data into phonebook
        for (int i = 0; i < entryNum; i++) {
            phoneBook[i][0] = userInput.nextLine();
            phoneBook[i][1] = userInput.nextLine();
        }
        
        //Keeping track of search entries
        for (int i = 0; i < entryNum; i++) {
            searches[i] = userInput.nextLine();
        }
        
        //Search
        for (int i = 0; i < phoneBook.length; i++) {
            if (searches[i].equals(phoneBook[i][0])) {
                System.out.println(phoneBook[i][0] + "=" + phoneBook[i][1]);
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}