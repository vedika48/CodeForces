import java.util.*;
public class towers_of_boxes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int temp = (d/m) + 1;
            if(temp>n){
                res.add(1);
                continue;
            }
            int num = n/temp;
            if(n%temp == 0) res.add(num);
            else res.add(num+1);
        }
        for(int val : res) System.out.println(val);
        sc.close();
    }
}
