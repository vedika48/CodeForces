import java.util.*;

public class grid_L {
    static class Pair {
        int n, m;
        Pair(int n, int m) {
            this.n = n;
            this.m = m;
        }
    }

    static void solve(Scanner sc, List<Pair> ans) {
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = p + 2 * q;
        int k = 2 * t + 1;
        int limit = (int)Math.sqrt(k);
        for (int i = limit; i >= 3; --i) {
            if (k % i == 0) {
                int tt = k / i;
                int n = (i - 1) / 2;
                int m = (tt - 1) / 2;
                if (Math.abs(n - m) <= p) {
                    ans.add(new Pair(n, m));
                    return;
                }
            }
        }
        ans.add(new Pair(-1, -1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Pair> ans = new ArrayList<>();
        while (t-- > 0) {
            solve(sc, ans);
        }
        for (Pair p : ans) {
            if (p.n == -1 && p.m == -1) {
                System.out.println(-1);
            } else {
                System.out.println(p.n + " " + p.m);
            }
        }
        sc.close();
    }
}