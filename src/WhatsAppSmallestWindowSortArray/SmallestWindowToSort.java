package WhatsAppSmallestWindowSortArray;

// This problem was asked by WhatsApp.
//
// Given an array of integers out of order, determine the bounds of the smallest window that must be sorted in order for the entire array to be sorted.
// For example, given [3, 7, 5, 6, 9], you should return (1, 3).

// [4, 6, 5, 8, 9] -> (1, 3)
// [3, 1, 2, 4, 6] -> (0, 2)
// [3, 4, 8, 5, 6] -> (2, 4)

public class SmallestWindowToSort {
    public static int indexOf(int[] arr, int o){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == o){
                index = i;
                break;
            }
        }
        return index;
    }
    public static String getSmallestWindow(int[] arr){
        // [3, 7, 5, 9]
        // in a sorted array, looping, arr[i] should always be > than max so far
        // [3, 7, 5, 6, 9]
        int[] window = {0, 0};
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else{
                window[1] = i;
                window[0] = indexOf(arr, max);
            }
        }
        return "(" + window[0] + ", " + window[1] + ")";
    }
    public static void main(String[] args){
        int[] test1 = {3, 7, 5, 6, 9};
        // [4, 6, 5, 8, 9] -> (1, 2)
        // [3, 1, 2, 4, 6] -> (0, 2)
        // [3, 4, 8, 5, 6] -> (2, 4)
        int[] test2 = {4, 6, 5, 8, 9};
        int[] test3 = {3, 1, 2, 4, 6};
        int[] test4 = {3, 4, 8, 5, 6};

        System.out.println(getSmallestWindow(test1));
        System.out.println(getSmallestWindow(test2));
        System.out.println(getSmallestWindow(test3));
        System.out.println(getSmallestWindow(test4));
    }
}
