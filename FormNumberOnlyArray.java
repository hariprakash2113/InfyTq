package InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

public class FormNumberOnlyArray {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] com = sc.nextLine().split(",");
        String ints[] = sc.nextLine().split(",");
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> sts = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
        for(String i:ints){
            arr.add(Integer.parseInt(i));
        }
        for(String i:com){
            String chars = "";
            String digs = "";
            for(char j:i.toCharArray()){
                if(Character.isDigit(j)){
                    digs+=j;
                }
                else{
                    chars+=j;
                }
            }
            if(arr.contains(Integer.parseInt(digs))){
                sts.add(chars);
                nums.add(digs);
            }
            else{
                sts.add("NA");
                nums.add("NA");
            }
        }
        for(int i=0;i<nums.size()-1;i++)
            System.out.print(nums.get(i)+",");
        System.out.println(nums.get(nums.size()-1));
        for(int i=0;i<sts.size()-1;i++)
            System.out.print(sts.get(i)+",");
        System.out.println(sts.get(sts.size()-1));
    }
}
