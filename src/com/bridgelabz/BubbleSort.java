package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array, int n){
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        /*  print sorted array  */
        System.out.println("Sorted array: ");
        for (int val : array) {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of integers to sort: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        /*  Take input from user for elements of array  */
        System.out.println("Enter "+n+" numbers: ");
        for (int i=0; i<n; i++)
            array[i] = sc.nextInt();
        /*  bubble sort array   */
        bubbleSort(array, n);
    }
}
