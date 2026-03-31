import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class antimedian_deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<int[]> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            int[] ans = new int[n];
            if(n==1){
                res.add(new int[]{1});
                continue;
            }
            for(int j=0; j<n; j++){
                ans[j] = 2;
            }
            res.add(ans);
        }
        for(int[] arr : res){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
