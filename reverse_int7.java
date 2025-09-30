package leetcode;
import java.lang.Math;
public class reverse_int7 {
    public static void main(String[] args) {
        System.out.println(reverse_int7.reverse(-2147488));
    }
    public static int reverse(int x){
       int answer=0;
        int num = Math.abs(x);
        while (num!=0){
            int y = num%10;
            if (answer>(Integer.MAX_VALUE-y)/10){
                return 0;
            }

            answer=answer*10+y;
            num/=10;
        }
       return (x>=0) ? (answer) : (-answer);

    }
}
