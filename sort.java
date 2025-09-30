package leetcode;

public class sort {
    public static void main(String[] args) {
        int [] a = {1,5,3,6};
        bubblesort(a);
        for(int i : a){
            System.out.println(i);
        }
    }
    public static int[] bubblesort(int [] a){
        int counter=1;
        int size=a.length;
        while (true){
            if (size-counter<=0){
                break;
            }
            for(int i=0; i<size-counter;i++){
             if(a[i]>a[i+1]){
                int var = a[i+1];
                a[i+1]=a[i];
                a[i]=var;
             }   
            }
            counter++;
            }
            return a;
        }
    }
    
    
