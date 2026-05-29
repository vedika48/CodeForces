import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class construct_an_array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        ArrayList<int[]> res = new ArrayList<>();
        while(t-->0){
            construct(res);
        }
        for(int[] arr : res){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    private static void construct(ArrayList<int[]> res){
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        HashSet<Integer> set = new HashSet<>();
        int count = 2;
        int i=1;
        while(count<2*n && i<n){
            if(!set.contains(count) && !set.contains(count+arr[i-1])){
                arr[i] = count;
                set.add(count);
                set.add(count+arr[i-1]);
                i++;
            }
            count++;
        }
        res.add(arr);
    }
}
