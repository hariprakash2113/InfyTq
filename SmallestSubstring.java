package InfyTq;

public class SmallestSubstring {
    public static void main(String args[]) {
        int n=7;
        String res=Integer.toString((int)Math.pow(n,2));
        System.out.println(res);
        if(Integer.toString(n).equals(res.charAt(res.length()-1)+"")){
            System.out.println("true");
        }   
        else{
            System.out.println("false");
        }     
    }
}
