package InfyTq;

import java.util.Arrays;
import java.util.Scanner;

/*

    Input : 

            4
            Knowledge,3
            Education,1
            Elephant,5
            Building,2


    Output:
        hn,gl,gKl


 */



public class ConsonantsAtEvenIndex {
    private static Scanner sc = new Scanner(System.in);
    static String vows = "aeiouAEIOU";

    private static String rotateString(String str, int k) {
        StringBuilder s = new StringBuilder(str);
        for(int i=0;i<k%str.length();i++){
            char tp = s.charAt(s.length()-1);
            s.insert(0,tp);
            s.deleteCharAt(s.length()-1);
        }
        return s.toString();
    }



    private static void findCons(String[] str) {
        for(int i=0;i<str.length;i++){
            String tp="";
            for (int j = 1; j < str[i].length(); j+=2) {
                if(!(vows.contains(str[i].charAt(j)+""))){
                    tp+=str[i].charAt(j);
                }
            }
            str[i]=tp;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            String[] tp = sc.nextLine().split(",");
            str[i]=rotateString(tp[0],Integer.parseInt(tp[1]));
        }
        findCons(str);
        Arrays.sort(str,(a,b)->(a.length()-b.length()==0 ? b.compareTo(a) : a.length() - b.length()));
        for(int i=0;i<n-1;i++){
            if(!str[i].equals("")){
                System.out.print(str[i]+",");
            }
        }
        if(!str[n-1].equals("")){
            System.out.print(str[n-1]);
        }
    }
    
    
}
