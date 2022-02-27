package InfyTq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    Input : -5,5,1,-2,7

    Output : -7,9,0,20
 */

public class SumOfIntervals {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] s = sc.nextLine().split(",");
        int[] arr = new int[s.length];
        int[] res = new int[s.length-1];
        ArrayList<Integer> negs = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
            if(arr[i]<0){
                negs.add(arr[i]);
                continue;
            }
            pos.add(arr[i]);
        }
        negs.addAll(pos);
        System.out.println(negs);
        for(int i=0;i<res.length;i++){
            int tp = negs.get(i+1)-negs.get(i);
            if(tp>1){
                int adder = 0;
                for(int j=negs.get(i)+1;j<negs.get(i+1);j++){
                    adder+=j;
                }
                res[i]=adder;
            }
        }
        String ans = Arrays.toString(res);
        System.out.println(ans.substring(1,ans.length()-1));
    }
}
