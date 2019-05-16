
package week1;

import java.util.Scanner;

public class Week1Ex02 {
    public static void main(String[] args)
    {
        //take input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.next();
        //declared array
        char[] name = new char[word.length()];
        System.out.println("The size of array is " + name.length);
        for(int i = 0; i < word.length(); i++)
        {
            name[i] = word.charAt(i);
        }
        for(int i = name.length-1; i >= 0; i--)
        {
            System.out.print(name[i]);
        }
        System.out.println();
    }
}
