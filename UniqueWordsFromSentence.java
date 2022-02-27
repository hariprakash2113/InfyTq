package InfyTq;

import java.util.Scanner;
/*

Input 1

God sees the sees people,god is great great,people sees the god

output 1

God sees the people
god is great 
X


Input 2 
All the glitters is not gold

Ouput 2

All the glitters is not gold

 */
import java.util.TreeSet;

public class UniqueWordsFromSentence {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        String[] arr = s.split(",");
        TreeSet<String> tr = new TreeSet<>();
        if(arr.length==1){
            String[] tp = s.split(" ");
            for(String x:tp){
                tr.add(x);
            }
            if(tr.size()==tp.length){
                System.out.println(-1);
                return;
            }
        }
        for(int i=0;i<arr.length;i++){
            String tp="";
            String[] ind = arr[i].split(" ");
            for(String a:ind){
                if(!tr.contains(a)){
                    tr.add(a);
                    tp+=(a+" ");
                }
            }
            if(tp.equals("")){
                System.out.println('X');
            }
            else{
                System.out.println(tp);
            }
        }
        if(tr.size()==0){
            System.out.println(-1);
        }
    }
}
