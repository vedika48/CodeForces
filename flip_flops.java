import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class flip_flops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Long> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            long c = sc.nextLong();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int j=0; j<n; j++){
                if(a[j]>c) break;
                long o = Math.min((long) k, c - a[j]);
                k -= o;
                c += a[j] + o;
            }
            res.add(c);
        }
        for(long val : res) System.out.println(val);
        sc.close();
    }
}