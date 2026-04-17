import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class equalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> ans = new ArrayList<>();
        while(t-->0){
            Winner(sc, ans);
        }
        for(String str : ans){
            System.out.println(str);
        }
        sc.close();
    }

    public static void Winner(Scanner sc, List<String> ans){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if(sum%2 != 0) ans.add("Yes");
        else{
            if((n*k)%2 == 0) ans.add("Yes");
            else ans.add("No");
        }
    }
}