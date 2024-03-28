package YoutubeLongestCommonSubsequence;

import java.util.ArrayList;

//Write a program that computes the length of the longest common subsequence of three given strings.
//For example, given "epidemiologist", "refrigeration", and "supercalifragilisticexpialodocious", it should return 5, since the longest common subsequence is "eieio".
public class LongestCommonSubsequence {

/**
*
* My initial approach, I understand why this doesn't work after a lot of testing and fiddling
*
*/
//    public static String LCS(ArrayList<String> strings){
//        String shortest = strings.get(0);
//        for(String s: strings){
//            if(s.length() < shortest.length()) {
//                shortest = s;
//            }
//        }
//        strings.remove(strings.indexOf(shortest));
//        ArrayList<String> compareTo = strings;
//
//        ArrayList<Character> out = new ArrayList<>();
//
//        for(char c: shortest.toCharArray()){
//            if(compareTo.get(0).indexOf(c) != -1 && compareTo.get(1).indexOf(c) != -1){
//                compareTo.set(0, compareTo.get(0).replaceFirst("" + c, ""));
//                compareTo.set(1, compareTo.get(1).replaceFirst("" + c, ""));
//                out.add(c);
//            }
//        }
//
//        return out.toString();
//
//    }

    public static int LCS_Solution(ArrayList<String> strings){
        String str0 = strings.get(0);
        String str1 = strings.get(1);
        String str2 = strings.get(2);

        int[][][] matrix = new int[str0.length() + 1][str1.length() + 1][str2.length() + 1];

        for(int i = 1; i <= str0.length(); i++){
            for(int j = 1; j <= str1.length(); j++){
                for(int k = 1; k <= str2.length(); k++){
                    if(str0.charAt(i-1) == str1.charAt(j - 1) && str0.charAt(i - 1) == str2.charAt(k - 1)){
                        matrix[i][j][k] = matrix[i-1][j-1][k-1] + 1;
                    }else{
                        matrix[i][j][k] = Math.max(Math.max(matrix[i-1][j][k], matrix[i][j-1][k]), matrix[i][j][k-1]);
                    }
                }
            }
        }
        return matrix[str0.length()][str1.length()][str2.length()];
    }
    public static void main(String[] args){
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> testOut = new ArrayList<>();
        test.add("epidemiologist");
        test.add("refrigeration");
        test.add("supercalifragilisticexpialodocious");
        int out = LCS_Solution(test);
        System.out.println(out); // expect 5
    }
}
