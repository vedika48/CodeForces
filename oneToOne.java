import java.util.Scanner;

public class oneToOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            for(int j=1; j<n-1; j++){
                if(sb.charAt(j-1)=='1' && sb.charAt(j+1)=='1') sb.setCharAt(j, '1');
            }
            int max = 0;
            for(int j=0; j<n; j++){
                if(sb.charAt(j)=='1') max++;
            }
            for(int j=1; j<n-1; j++){
                if(sb.charAt(j-1)=='1' && sb.charAt(j+1)=='1') sb.setCharAt(j,'0');
            }
            int min = 0;
            for(int j=0; j<n; j++){
                if(sb.charAt(j)=='1') min++;
            }
            res.append(min).append(" ").append(max);
            if(i < t-1) res.append("\n");
        }
        System.out.println(res);
        sc.close();
    }
}
