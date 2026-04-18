import java.util.*;

public class unique_values{
    static Scanner sc = new Scanner(System.in);
    static int n;

    static int Ask(List<Integer> a){
        System.out.print("? " + a.size());
        for (int x : a) {
            System.out.print(" " + (x + 1));
        }
        System.out.println();
        System.out.flush();
        return sc.nextInt();
    }

    static int Query(int p){
        if (p == 0) return 0;
        if (p == 2 * n + 1) return 3;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            a.add(i);
        }
        int x = Ask(a);
        List<Integer> b = new ArrayList<>();
        for (int i = p; i < 2 * n + 1; i++) {
            b.add(i);
        }
        int y = Ask(b);
        if (x == y) {
            if (((a.size() ^ x) % 2) == 0) return 0; 
            else return 3;
        }
        else {
            if (x > y) return 1;
            else return 2;
        }
    }

    public static void main(String[] args){
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            List<Integer> ans = new ArrayList<>();
            for (int val = 1; val <= 3; val++) {
                int low = 0, high = 2 * n + 1;
                while (low + 1 < high) {
                    int mid = (low + high) / 2;
                    int x = Query(mid);
                    if (x >= val) high = mid;
                    else low = mid;
                }
                ans.add(high);
            }
            System.out.println("! " + ans.get(0) + " " + ans.get(1) + " " + ans.get(2));
            System.out.flush();
        }
    }
}