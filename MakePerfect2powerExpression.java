package InfyTq;

import java.util.Scanner;

    /*
    
        Input : 10,100

        Output : 7,26
    
    */

public class MakePerfect2powerExpression {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ip = sc.nextLine().split(",");
        StringBuilder s = new StringBuilder();
        for(String i:ip){
            s.append(","+findSize(i));
        }
        s.deleteCharAt(0);
        System.out.println(s.toString());
    }

    private static Integer findSize(String s) {
        int n = Integer.parseInt(s);
        int c=1;
        while(n!=1){
            c++;
            n = n%2==0 ? n/2 : (n*3)+1;
        }
        return c;
    }
}
