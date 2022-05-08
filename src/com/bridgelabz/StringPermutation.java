package com.bridgelabz;

import java.util.Scanner;

public class StringPermutation {
    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    public static void generatePermutation(String string, int start, int end){
        if (start == end)
            System.out.println(string);
        else
        {
            /**
             * @param string string to calculate permutation for
             * @param start starting index
             * @param end end index
             */
            for (int i = start; i <= end; i++)
            {
                /*  Swapping the string by fixing a character */
                string = swapString(string, start, i);
                /*  Recursively calling function generatePermutation()
                 *  for rest of the characters
                 */
                generatePermutation(string,start+1, end);
                /*  Backtracking and swapping the characters again  */
                string = swapString(string, start, i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        generatePermutation(string, 0, string.length()-1);
    }
}
