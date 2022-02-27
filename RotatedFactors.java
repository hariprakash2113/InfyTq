package InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RotatedFactors {
    private static Scanner sc = new Scanner(System.in);
    private static String[] arr;
    private static void findAllCombos(String s){
        StringBuffer sb = new StringBuffer(s);
        arr[0]=sb.toString();
        for(int i=1;i<s.length();i++){
            char a = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(a);
            arr[i]=sb.toString();
        }
    }
    public static void main(String[] args) {
        String s = sc.nextLine();
        arr=new String[s.length()];
        findAllCombos(s);
        ArrayList<Integer> res = new ArrayList<>();
        for(String i:arr){
            String[] tp = new String[i.length()];
            String x = "";
            for(int j=0;j<i.length();j++){
                x+=i.charAt(j);
                tp[j]=x;
            }
            for(String k:tp){
                if(Integer.parseInt(i)%Integer.parseInt(k)==0){
                    res.add(Integer.parseInt(k));
                }
            }
        }
        Collections.sort(res);
        System.out.println(res);
    }
}
