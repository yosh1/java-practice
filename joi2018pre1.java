import java.util.*;
public class joi2018pre1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        // スペース区切りの整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ans,xYen,yYen;

        int setX = (n+a-1)/a;
        int setY = (n+b-1)/b;

        xYen = setX * b;
        yYen = setY * d;

        if(xYen > yYen){
          ans = yYen * 2;
        }else{
          ans = xYen * 2;
        }
        // 出力
        System.out.println(ans);
    }
}
