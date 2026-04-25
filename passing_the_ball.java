import java.util.ArrayList;
import java.util.Scanner;

public class passing_the_ball {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        while(t-->0){
            res.add(totalPass());
        }
        for(int val : res) System.out.println(val);
    }
    public static int totalPass(){
        int n = sc.nextInt();
        String s = sc.next();
        int count = 1;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='R') count++;
            else return count;
        }
        return 0;
    }
}
