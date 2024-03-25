package SalesforceMaximumXOR;

// Given an array of integers, find the maximum XOR of any two elements.

// 5 + 8
// 0101 + 1000
// 1101
// 13

import java.util.ArrayList;

public class ArrayMaximumXOR {

    public static int maximumXOR(int[] arr){
        ArrayList<Integer> out = new ArrayList<Integer>();
        out.add(0);
        out.add(0);
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                //System.out.println("i:" + i + "\nj:" + j);
                if((arr[i]^arr[j]) > (out.get(0)^out.get(1))){
                    out.set(0, arr[i]);
                    out.set(1, arr[j]);
                }
            }
        }
        return out.get(0)^out.get(1);
    }
    public static void main(String[] args){
        int[] test1 = {25, 10, 2, 8, 5, 3};
        // max xor should be 28 (?)
        int[] test2 = {1, 2, 3, 4, 5, 6, 7};
        // max xor should be 7 (?)
        System.out.println(maximumXOR(test1));
        System.out.println(maximumXOR(test2));
    }
}
