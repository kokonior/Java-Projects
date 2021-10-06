package com.company;

import java.util.Scanner;

public class BinSearchAsc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {-34, -28, -8, -1, 4, 16, 45, 79}; //Ascending
        int target = 16;

        int result = binsearch(arr, target);

        System.out.println(result);
    }

    static int binsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;                   //only the end will change if target is on the left
            }
            else if(target > arr[middle]){
                start = middle + 1;                 //only the start will change if target is on the right
            }
            else{
                return middle;                      //when the target is at the middle of the array
            }
        }

        return -1;
    }
}
