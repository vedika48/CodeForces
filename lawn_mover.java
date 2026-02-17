import java.util.ArrayList;
import java.util.Scanner;

public class lawn_mover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int w = sc.nextInt();
            res.add(n-(n/w));
        }
        for(int val : res){
            System.out.println(val);
        }
        sc.close();
    }
}