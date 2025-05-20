import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = Integer.toString(n);
        if(n>=-100 && n<=100 && Integer.parseInt(s)==n){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
