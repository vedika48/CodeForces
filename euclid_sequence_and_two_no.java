import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class euclid_sequence_and_two_no {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        while(t-->0) euclidSeq(res);
        for(List<Integer> list : res){
            for(int val : list) System.out.print(val+" ");
            System.out.println();
        }
    }
    private static void euclidSeq(List<List<Integer>> res){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        boolean euclid = true;
        Arrays.sort(arr);
        for(int i=n-1; i>=2; i--){
            if(arr[i-2] != (arr[i]%arr[i-1])){
                list.add(-1);
                euclid = false;
                break;
            }
        }
        if(euclid){
            list.add(arr[n-1]);
            list.add(arr[n-2]);
        }
        res.add(list);
    }
}
