import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class absolute_cinema {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<Long> res = new ArrayList<>();
        while(t-->0){
            summation(res);
        }
        for(long val : res) System.out.println(val);
    }
    private static void summation(List<Long> res){
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long max = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextLong();
        }
        long sum = 0;
        for(int i=0; i<n; i++){
            if(a[i]>b[i]){
                long temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            sum += b[i];
            max = Math.max(max, a[i]);
        }
        res.add(sum+max);
    }
}
