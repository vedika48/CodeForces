
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class optimal_purchase {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        List<Long> res = new ArrayList<>();
        while(t-->0){
            optimal(res);
        }
        for(long val : res){
            System.out.println(val);
        }
    }
    private static void optimal(List<Long> res){
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long grp = n/3;
        long ans = Math.min(n*a, Math.min((grp+1)*b, grp*b + (n-(grp*3))*a));
        res.add(ans);
    }
}
