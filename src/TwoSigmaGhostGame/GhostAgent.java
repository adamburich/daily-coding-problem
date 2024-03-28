package TwoSigmaGhostGame;

import java.util.ArrayList;
import java.util.Arrays;

//This problem was asked by Two Sigma.
//
//Ghost is a two-person word game where players alternate appending letters to a word.
//The first person who spells out a word, or creates a prefix for which there is no possible continuation, loses. Here is a sample game:
//
//Player 1: g
//Player 2: h
//Player 1: o
//Player 2: s
//Player 1: t [loses]
//Given a dictionary of words, determine the letters the first player should start with, such that with optimal play they cannot lose.
//
//For example, if the dictionary is ["cat", "calf", "dog", "bear"], the only winning start letter would be b.
public class GhostAgent {

    public static ArrayList<Character> chooseFirstCharacter(ArrayList<String> dict){
        ArrayList<String> badChoices = new ArrayList<>();
        ArrayList<String> goodChoices = new ArrayList<>();
        for(String s: dict){
            if(s.length() % 2 == 1){
                badChoices.add(s);
            }else{
                goodChoices.add(s);
            }
        }

        ArrayList<String> moreBadChoices = new ArrayList<>();
        ArrayList<String> betterChoices = new ArrayList<>();
        for(String sGood: goodChoices){
            for(String sBad: badChoices){
                if(sGood.charAt(0) == sBad.charAt(0)){
                    moreBadChoices.add(sGood);
                }
            }
        }

        badChoices.addAll(moreBadChoices);

        for(String s: goodChoices){
            if(!badChoices.contains(s)){
                betterChoices.add(s);
            }
        }

        ArrayList<Character> goodStarts = new ArrayList<>();

        for(int i = 0; i < betterChoices.size(); i++){
            if(!goodStarts.contains(betterChoices.get(i).charAt(0))){
                goodStarts.add(betterChoices.get(i).charAt(0));
            }
        }

        return goodStarts;
    }
    public static void main(String[] args){
        String[] sample = {"cat", "calf", "dog", "bear", "bored", "examples"};
        String[] otherSample = {"something", "hi", "cat", "dog", "bear", "hola"};
        ArrayList<String> sampleList = new ArrayList<>(Arrays.asList(sample));
        ArrayList<String> otherSampleList = new ArrayList<>(Arrays.asList(otherSample));
        System.out.println(chooseFirstCharacter(sampleList));
        System.out.println(chooseFirstCharacter(otherSampleList));
    }
}
