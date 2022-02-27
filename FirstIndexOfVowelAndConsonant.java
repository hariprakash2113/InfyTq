package InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    Input : temperature

    Output : aeeeu6mprrtt7

*/

public class FirstIndexOfVowelAndConsonant {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        ArrayList<Character> vows = new ArrayList<>();
        ArrayList<Character> cons  = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i)+"")){
                vows.add(s.charAt(i));
                continue;
            }
            cons.add(s.charAt(i));
        }
        Collections.sort(vows);
        Collections.sort(cons);
        if(vows.size()==0){
            System.out.print("NA-1");
        }
        else{
            int idx = s.indexOf((vows.get(0)+""));
            for(char i:vows){
                System.out.print(i);
            }
            System.out.print(idx);
        }
        if(cons.size()==0){
            System.out.print("NA-1");
        }
        else{
            int idx = s.lastIndexOf((cons.get(cons.size()-1)+""));
            for(char i:cons){
                System.out.print(i);
            }
            System.out.print(idx);
        }
    }
}
