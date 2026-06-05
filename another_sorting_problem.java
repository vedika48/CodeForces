import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class another_sorting_problem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<String> res = new ArrayList<>();
        while(t-->0){
            sorted(res);
        }
        for(String str : res) System.out.println(str);
    }
    private static void sorted(List<String> res){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<n-1; i++){
            max = Math.max(max, arr[i]-arr[i+1]);
        }
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]) arr[i] += max;
        }
        boolean sorted = true;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
                break;
            }
        }
        res.add(sorted ? "YES" : "NO");
    }
}