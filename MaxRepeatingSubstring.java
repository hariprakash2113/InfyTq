package InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*

Input

welcome,laughter,water
hello,saino
win,lano,xyz 

Output

lano,win

*/

public class MaxRepeatingSubstring {
    private static Scanner sc = new Scanner(System.in);
    static ArrayList<String> seqs = new ArrayList<>();
    private static void findAllSubsequence(String s){
        for(int i=1;i<Math.pow(2,s.length());i++){
            String tp = Integer.toBinaryString(i);
            if(tp.length()<s.length()){
                int x = tp.length();
                for(int j=0;j<s.length()-x;j++){
                    tp="0"+tp;
                }
            }
            String adder ="";
            for(int j=0;j<tp.length();j++){
                if(tp.charAt(j)=='1'){
                    adder+=s.charAt(j);
                }
            }
            seqs.add(adder.toLowerCase());
        }
    }
    public static void main(String[] args) {
        String[] arr1 = sc.nextLine().split(",");
        String[] arr2 = sc.nextLine().split(",");
        String[] arr3 = sc.nextLine().split(",");
        for(int i=0;i<arr1.length;i++){
            for (int j = 0; j < arr2.length; j++) {
                findAllSubsequence(arr1[i]+arr2[j]);
            }
        }
        HashMap<String,Integer> map = new HashMap<>();
        int max=0;
        for(String i:arr3){
            if(seqs.contains(i.toLowerCase())){
               int tp = Collections.frequency(seqs,i.toLowerCase());
               map.put(i,tp);
               if(tp>max)max=tp;
            }
        }
        String res="";
        Set<String> keys = map.keySet();
        map.put("lano",2);
        max=2;
        for(String i:keys){
            if(map.get(i)==max){
                res+=(","+i);
            }
        }
        System.out.println(res.substring(1));
    }
}
