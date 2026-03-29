import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a_simple_sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<int[]> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = n-j;
            }
            res.add(arr);
        }
        for(int[] arr : res){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
