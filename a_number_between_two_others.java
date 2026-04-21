import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a_number_between_two_others {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<String> res = new ArrayList<>();
        while(t-->0){
            if(ifExists()) res.add("Yes");
            else res.add("No");
        }
        for(String str : res) System.out.println(str);
    }
    public static boolean ifExists(){
        long x = sc.nextLong();
        long y = sc.nextLong();
        if(2*x>=y) return false;
        for(long i=2*x; i<y; i+=x){
            if(y%i!=0) return true;
        }
        return false;
    }
}
