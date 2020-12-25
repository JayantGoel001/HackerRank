import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n;i++){
            a[i] = in.nextInt();
        }
        int numberOfSwaps = 0;
        // Write Your Code Here
        for (int i = 0; i < n; i++) {
    // Track number of elements swapped during a single array traversal
    
    
    for (int j = 0; j < n - i-1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            numberOfSwaps++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
    }
    System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
    System.out.println("First Element: "+a[0]);
    System.out.println("Last Element: "+a[n-1]);


    }
}

