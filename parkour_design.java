import java.io.*;
import java.util.*;

public class parkour_design {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long val = x + 4L * y;
            if (val % 3 != 0) {
                out.append("NO\n");
                continue;
            }
            long k = val / 3;
            if (k < 0) {
                out.append("NO\n");
                continue;
            }
            long minA = Math.max(0, y);
            long maxA = k / 2;
            if (minA <= maxA) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        System.out.print(out.toString());
    }
}