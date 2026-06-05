import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class slimes_on_a_line {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        while (t-->0) {
            noOfOpr(res);
        }
        for(int val : res) System.out.println(val);
    }
    private static void noOfOpr(List<Integer> res){
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        res.add((max-min+1)/2);
    }
}