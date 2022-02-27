package InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialNumbers{
    private static Scanner sc = new Scanner(System.in);

    private static int factorCount(String s,int num){
        ArrayList<Integer> factList = new ArrayList<>();
        factList.add(1);
        factList.add(num);
        for(int i=2;i<num;i++){
            if(num%i==0){
                factList.add(i);
            }
        }
        int count=0;
        for(int i:factList){
            if(s.contains(i+"")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = sc.nextLine();//  i/p -> 2340567 o/p -> 56
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){    
            String tp = s.charAt(i)+""+s.charAt(i+1);
            arr.add(Integer.parseInt(tp));
        }
        int max = 0;
        int maxElem=0;
        for(int i:arr){
            int tp = factorCount(s,i);
            if(tp>=max){
                if(i>maxElem){
                    max=tp;
                    maxElem=i;
                }
            }
        }
        System.out.println(maxElem);
    }
}