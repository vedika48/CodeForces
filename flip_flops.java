import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class flip_flops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            for(int j=0; j<n; j++){
                if(a[j]>c) continue;
                if(k==0) break;
                if(c-a[j] < k){
                    k -= c-a[j];
                    a[j] = c;
                }
                else if(c-a[j] > k){
                    a[j] += k;
                    k = 0;
                }
            }
            for(int j=a.length-1; j>=0; j--){
                if(a[j] < c) continue;
                c += a[j];
            }
            res.add(c);
        }
        for(int val : res) System.out.println(val);
        sc.close();
    }
}
