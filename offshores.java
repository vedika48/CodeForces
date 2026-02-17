import java.util.*;
public class offshores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            PriorityQueue<Integer> que = new PriorityQueue<>();
            for(int j=0; j<n; j++){
                que.add(sc.nextInt());
            }
            while(que.size() != 1){
                int num = que.poll();
                if(num%x == 0){
                    int temp = (num/x) * y;
                    int curr = que.poll();
                    que.add(curr+temp);
                }
            }
            res.add(que.poll());
        }
        for(int val : res) System.out.println(val);
        sc.close();
    }
}
