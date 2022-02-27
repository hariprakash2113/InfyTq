package InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueStringCount {

    /*
        Input : bcdef,abcdefg,bcde,100,bcdef,bcde
        output :1,2,2
     */
    
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] s = sc.nextLine().split(",");
        ArrayList<String> ori = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            ori.add(s[i].toLowerCase());
        }
        HashMap<String,Integer> tr = new HashMap<>();
        for(String i:s){
            if(isOnlyAlpha(i)){
                tr.put(i.toLowerCase(),Collections.frequency(ori,i));
            }
        }
        if(tr.size()!=0)
            for(String i:s){
                if(tr.get(i)!=null){
                    System.out.print(tr.get(i)+" ");
                    tr.put(i,null);
                }
            }
        else
        System.out.println(-1);
    }
    private static boolean isOnlyAlpha(String i) {
        for(char j:i.toCharArray()){
            if(Character.isDigit(j)){
                return false;
            }
        }
        return true;
    }
}
