import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cake_leveling {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<long[]> res = new ArrayList<>();
        while(t-->0){
            maxLevel(res);
        }
        for(long[] arr : res){
            for(long val : arr) System.out.print(val + " ");
            System.out.println();
        }
    }
    private static void maxLevel(List<long[]> res){
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] ans = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        long sum = 0;
        long curr = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum += arr[i];
            curr = Math.min(curr, sum/(i+1));
            ans[i] = curr;
        }
        res.add(ans);
    }
}
