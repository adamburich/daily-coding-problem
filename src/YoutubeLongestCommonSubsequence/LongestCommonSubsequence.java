package YoutubeLongestCommonSubsequence;

import java.util.ArrayList;

//Write a program that computes the length of the longest common subsequence of three given strings.
//For example, given "epidemiologist", "refrigeration", and "supercalifragilisticexpialodocious", it should return 5, since the longest common subsequence is "eieio".
public class LongestCommonSubsequence {

    public static String LCS(ArrayList<String> strings){
        String shortest = strings.get(0);
        for(String s: strings){
            if(s.length() < shortest.length()) {
                shortest = s;
            }
        }
        strings.remove(strings.indexOf(shortest));
        ArrayList<String> compareTo = strings;

        ArrayList<Character> out = new ArrayList<>();

        for(char c: shortest.toCharArray()){
            if(compareTo.get(0).indexOf(c) != -1 && compareTo.get(1).indexOf(c) != -1){
                compareTo.set(0, compareTo.get(0).replaceFirst("" + c, ""));
                compareTo.set(1, compareTo.get(1).replaceFirst("" + c, ""));
                out.add(c);
            }
        }

        return out.toString();

    }
    public static void main(String[] args){
        ArrayList<String> test = new ArrayList<>();
        test.add("epidemiologist");
        test.add("refrigeration");
        test.add("supercalifragilisticexpialodocious");
        System.out.println(LCS(test));
    }
}
