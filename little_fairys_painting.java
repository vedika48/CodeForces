import java.util.*;
public class little_fairys_painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            int dis = map.size();
            while(!map.containsKey(dis)){
                dis++;
            }
            res.add(dis);
        }
        for(int i: res){
            System.out.println(i);
        }
        sc.close();
    }
}
