import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class convergence {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        while(t-->0){
            halfLength(res);
        }
        for(int val : res) System.out.println(val);
    }

    private static void halfLength(List<Integer> res){
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int target = arr[left + (right - left)/2];
        while(left<right){
            if(arr[left]==arr[right] && arr[left]==target) count--;
            count++;
            left++;
            right--;
        }
        res.add(count++);
    }
}