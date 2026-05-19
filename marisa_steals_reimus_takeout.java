import java.util.ArrayList;
import java.util.Scanner;

public class marisa_steals_reimus_takeout {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        while(t-->0){
            takeouts(res);
        }
        for(int val : res) System.out.println(val);
    }
    private static void takeouts(ArrayList<Integer> res){
        int n = sc.nextInt();
        int[] arr = new int[3];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr[x]++;
        }
        int ans = arr[0];
        int pair = Math.min(arr[1], arr[2]);
        ans += pair;
        arr[1] -= pair;
        arr[2] -= pair;
        ans += arr[1]/3 + arr[2]/3;
        res.add(ans);
    }
}