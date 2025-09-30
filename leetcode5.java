package leetcode;

public class leetcode5 {
    public static void main(String[] args){
        String s ="dbbc";
        System.out.println(longestPalindrome(s));

    }
    public static String longestPalindrome(String s){
        int len = s.length();
        String result="";
        for(int i=0;i<len;i++){
            if(s.charAt(i)==s.charAt(len-1-i)){
                result+=s.charAt(i);
            }else;
            result="";
        }
        return result;
    }
}
