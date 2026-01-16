import java.util.*;

public class max_subarray_part2 {
    public static void main(String args[]){
        int numbers[] = {2,-3,-6,8,9,-5};
        subarray(numbers);
    }

    public static void subarray(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int start=0; start<numbers.length; start++){
            for(int end=start; end<numbers.length; end++){
                // Correct formula
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);
    }
}
