package com.company;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceil(arr, target);
        System.out.println(ans);
    }
    //return the smallest number in the array which is greater than or equal to the target
    static int Ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            if(target> arr[arr.length-1]){
                return -1;
            }
            int mid = start + (end-start)/2;

            if(arr[mid] > target)
            {
                end = mid -1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
               return mid;
            }
        }
        return start;


    }
}
