//Bitonic Array or Mountain array

// find the greatest element in the array that is first gradually increasing and then decreasting like a mountain
// {1,3,6,9,15,14,8,7,2,0};  here ans is 15

public class BitonicArray 
{
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 9, 17, 19, 20, 29, 15, 14, 8, 7, 2, 0 };
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int great = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                great = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return great;
    }

}
