package InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

/*

Input 

15,3,1,70,53,71

output

153,370,371

*/
public class UniqueArmstrong {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] s = sc.nextLine().split(",");
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(arr.contains(s[i]+s[j]))continue;
                arr.add(s[i]+s[j]);
            }
        }
        String res = "";
        for(String i:arr){
            if(isArm(i)){
                res+=(","+i);
            }
        }
        System.out.println(res.substring(1));
    }
    private static boolean isArm(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int tp = Integer.parseInt(s.charAt(i)+"");
            sum+=(Math.pow(tp,n));
        }
        if((sum+"").equals(s))return true;
        return false;
    }
}
