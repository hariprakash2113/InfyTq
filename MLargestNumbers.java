package InfyTq;

import java.util.Scanner;
import java.util.Arrays;

/*

Input 


101,101,610,447,389
610,4,101,4,101


Output

447,610
101,610

*/

public class MLargestNumbers {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] in1 = sc.nextLine().split(",");
        String[] in2 = sc.nextLine().split(",");
        int[] arr1 = new int[in1.length];
        int[] arr2 = new int[in2.length];
        int n = arr1.length;
        for(int i=0;i<n;i++){
            arr1[i]=Integer.parseInt(in1[i]);
            arr2[i]=Integer.parseInt(in2[i]);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int min=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)continue;
                if(arr1[i]==arr2[j]){
                    min=arr1[i];
                    break;
                }
            }
        }
        if(min==0){
            System.out.println(-1);
            return;
        }
        if((min+"").length()>1){
            min=min%9==0 ? 9:min%9;
        }
        for(int i=n-min;i<n-1;i++){
            System.out.print(arr1[i]+",");
        }
        System.out.println(arr1[n-1]);
        for(int i=n-min;i<n-1;i++){
            System.out.print(arr2[i]+",");
        }
        System.out.println(arr2[n-1]);
    }
}
