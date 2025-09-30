package leetcode;
import java.lang.Math;
public class reverse_int7 {
    public static void main(String[] args) {
        System.out.println(reverse_int7.reverse(1534236469));
        System.out.println(154/10);
    }
    public static int reverse(int x){
        boolean isPos;
        if (x>=0){
            isPos = true;
       }else{
        isPos=false;
       }
       int size=0;
       int clone =x;
        while (true){
            if (clone != 0) {
                clone=clone/10;
                size+=1;
            }else {
                break;
            }
        }
        System.out.println(size);
        int answer=0;
        int count=0;
        System.out.println("");
        for(int i = 1; i<=size;i++){
            int num= (int) (x%Math.pow(10, i));
            System.out.println(num);
            num= (int) (num/Math.pow(10,count));
            System.out.println(num);
            count++;
            System.out.println(num);
            answer+=num;
            num=0;
        }
       return answer;

    }
}
