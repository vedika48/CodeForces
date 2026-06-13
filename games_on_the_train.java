import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class games_on_the_train {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        while(t-->0){
            findMax(res);
        }
        for(int val : res) System.out.println(val);
    }
    private static void findMax(List<Integer> res){
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        res.add(max-min+1);
    }
}
