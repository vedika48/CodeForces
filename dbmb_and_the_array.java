import java.util.*;
public class dbmb_and_the_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int[] arr = new int[n];
            int sum=0;
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }
            if(s<sum) res.add("No");
            else if(sum==s || (s-sum)%x==0) res.add("Yes");
            else res.add("No");
        }
        sc.close();
        for(String str : res){
            System.out.println(str);
        }
    }
}