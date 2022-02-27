package InfyTq;

import java.util.Scanner;

/*

    Input : ABC123+  --> QUJDMTIzKw
            Lane-1   --> -1

*/

public class EightBitEncoding {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        StringBuffer x = new StringBuffer();
        String usage = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        for(int i=0;i<s.length();i++){
            Character tp = s.charAt(i);
            if(!Character.isLetterOrDigit(tp) || !(tp=='+' || tp=='/')){
                System.out.println(-1);
                return;
            }
            String charBin=Integer.toBinaryString(tp);
            while(charBin.length()<8){
                charBin="0"+charBin;
            }
            x.append(charBin);
        }
        while(!(x.length()%6==0)){
            x.append("0");
        }
        for(int i=0;i<=x.length()-6;i+=6){
            String tp =x.substring(i,i+6);
            System.out.print(usage.charAt((Integer.parseInt(tp,2))));
        }
    }
}
