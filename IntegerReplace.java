package InfyTq;

import java.util.Scanner;
/*

    Input : 43,66,225,76
    Output : 116.0

*/
public class IntegerReplace {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] ip = sc.nextLine().split(",");
        double avg = 0;
        for (int i = 0; i < ip.length; i++) {
            StringBuffer s;
            if(ip[i].contains("6")){
                s = new StringBuffer(ip[i].replaceAll("6", "9"));
                s.reverse();
                avg+=(Integer.parseInt(s.toString())/(double)ip.length);
                continue;
            }
            avg+=Integer.parseInt(ip[i])/(double)ip.length;
        }
        System.out.println(avg);
    }
}
