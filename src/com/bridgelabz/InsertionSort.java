package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(String[] array, int n){
        for (int i = 0; i < n; i++) {
            String temp;
            for (int j = i+1; j < n; j++) {
                if (array[i].compareTo(array[j])>0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        /*  print sorted array  */
        System.out.println("Sorted array: ");
        for (String val: array) {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of strings to sort: ");
        int n = sc.nextInt();
        String array[] = new String[n];
        /*  Take input from user for elements of array  */
        System.out.println("Enter "+n+" strings: ");
        for (int i=0; i<n; i++)
            array[i] = sc.next();
        /*  insertion sort array   */
        insertionSort(array, n);
    }
}
