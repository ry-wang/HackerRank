import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int line=1;
        while(input.hasNextLine()){
                System.out.println(line+" "+input.nextLine());
                line++;
        }
    }
}
