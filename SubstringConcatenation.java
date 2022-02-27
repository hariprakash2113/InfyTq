package InfyTq;

import java.util.Scanner;

public class SubstringConcatenation {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String one = sc.nextLine();
        String two = sc.nextLine();
        int par = Integer.parseInt(sc.nextLine());
        if(par>= one.length() || par>=two.length()){
            System.out.println(one+two);
            return;
        }
        
    }
}
