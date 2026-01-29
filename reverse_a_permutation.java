import java.util.*;
public class reverse_a_permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<int[]> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            int curr = n;
            for(int j=0; j<n; j++){
                if(curr==1) res.add(arr);
                if(arr[j] == curr) curr--;
                else{
                    for(int k=j+1; k<n; k++){
                        if(arr[k]==curr){
                            reverse(arr, j, k);
                            res.add(arr);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        for(int[] arr:res) {
            for(int num:arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp =arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
