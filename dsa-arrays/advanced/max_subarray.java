import java.util.*;
public class max_subarray{
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        maxsubarray(numbers);
    }
    public static void maxsubarray(int numbers[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+ " ");
                    sum = sum + numbers[k];
                    if(maxsum<sum){
                        maxsum = sum;
                    }
                    
                }System.out.print("Sum: " + sum );
                sum = 0;
                System.out.println();
            }
            System.out.println(); 
        } System.out.println("Max Sum : " + maxsum); 
    }
}