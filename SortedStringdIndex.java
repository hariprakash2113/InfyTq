package InfyTq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 /*
    Input : gt4r22w7e

    Output : egrtw2:153
    
*/



public class SortedStringdIndex {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        ArrayList<Character> alpha = new ArrayList<>();
        ArrayList<Character> nums = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                alpha.add(s.charAt(i));
            }
            else{
                nums.add(s.charAt(i));
                sum+=Integer.parseInt(s.charAt(i)+"");
            }
        }
        Collections.sort(alpha);
        Collections.sort(nums);
        int ha=s.indexOf(alpha.get(alpha.size()-1));
        int la=s.indexOf(alpha.get(0));
        int ld=s.indexOf(nums.get(0));
        int hd=s.indexOf(nums.get(nums.size()-1));
        for(char i:alpha){
            System.out.print(i);
        }
        System.out.print(Math.abs(ha-la)+":");
        System.out.print(sum+""+Math.abs(hd-ld));
    }
}
