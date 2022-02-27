package InfyTq;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeSubstring {
    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Integer> findAllSubsequence(String s) {
        ArrayList<Integer> seqs = new ArrayList<>();
        for (int i = 1; i < Math.pow(2, s.length()); i++) {
            String tp = Integer.toBinaryString(i);
            if (tp.length() < s.length()) {
                int x = tp.length();
                for (int j = 0; j < s.length() - x; j++) {
                    tp = "0" + tp;
                }
            }
            String adder = "";
            for (int j = 0; j < tp.length(); j++) {
                if (tp.charAt(j) == '1') {
                    adder += s.charAt(j);
                }
            }
            seqs.add(Integer.parseInt(adder));
        }
        return seqs;

    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n < 2 || n % 2 == 0)
            return false;
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        ArrayList<Integer> seqs = findAllSubsequence(s);
        int max = 0;
        for (int i : seqs) {
            if (isPrime(i)) {
                if (i > max)
                    max = i;
            }
        }
        if (max == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(max);
    }
}
