import java.util.ArrayList;
import java.util.Scanner;

public class interval_mod {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        ArrayList<Long> res = new ArrayList<>();
        while(t-->0){
            module(res);
        }
        for(long val : res) System.out.println(val);
    }
    public static void module(ArrayList<Long> res){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] b = new int[n];
        int[] c = new int[n];
        int[] minArr = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = arr[i] % p;
            c[i] = (arr[i] % q) % p;
            minArr[i] = Math.min(b[i], c[i]);
        }
        long[] prefB = new long[n+1];
        long[] prefC = new long[n+1];
        long[] prefMin = new long[n+1];
        for(int i = 0; i < n; i++){
            prefB[i+1] = prefB[i] + b[i];
            prefC[i+1] = prefC[i] + c[i];
            prefMin[i+1] = prefMin[i] + minArr[i];
        }
        long base = prefMin[n];
        long ans = Long.MAX_VALUE;
        for(int i = 0; i + k <= n; i++){
            int l = i;
            int r = i + k;
            long sumMin = prefMin[r] - prefMin[l];
            long sumB = prefB[r] - prefB[l];
            long sumC = prefC[r] - prefC[l];
            long candidate = base - sumMin + Math.min(sumB, sumC);
            ans = Math.min(ans, candidate);
        }
        res.add(ans);
    }
}