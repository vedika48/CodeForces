import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ai_project_development {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        while(t-->0){
            reqHours(res);
        }
        for(int val : res) System.out.println(val);
    }
    private static void reqHours(List<Integer> res) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int ans = ceil(n, x+y);
        if(z*x<=n) ans = Math.min(ans, ceil(n-z*x, x+10*y)+z);
        res.add(ans);
    }
    private static int ceil(int a, int b){
        return (a+b-1)/b;
    }
}
