package InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestValuewith0to5 {
    private static Scanner sc = new Scanner(System.in);

    private static boolean valid(String s) {
        if(s.contains("1") && s.contains("2") && s.contains("3") && s.contains("4") && s.contains("5")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(",");
        ArrayList<String> res = new ArrayList<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j)continue;
                String tp =(arr[i]+arr[j]);
                if(valid(tp)){
                    res.add(tp);
                    if(tp.length()>max){
                        max=tp.length();
                    }
                }
            }
        }
        for(String i:res){
            if(i.length()==max){
                System.out.println(i);
                return;
            }
        }
    }
}
