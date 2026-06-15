import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class different_distances {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        List<String> res = new ArrayList<>();
        while(t-->0){
            differences(res);
        }
        for(String str : res){
            System.out.println(str);
        }
    }
    private static void differences(List<String> res){
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0){
            for(int i=0; i<n; i+=2){
                sb.append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ");
            }
        }
        else{
            sb.append("3 3 2 1 1 2 1 2 2 3 1 3 ");
            for (int i = 3; i < n; i += 2) {
                sb.append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 2).append(" ")
                  .append(i + 1).append(" ");
            }
        }
        res.add(sb.toString());
    }
}
