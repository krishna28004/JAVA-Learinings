import java.util.*;
public class kadans_subarray {
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-2,1,5,-3,1};
        subarrays(numbers);
    }
    public static void subarrays(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currsum = currsum + numbers[i];
            if (currsum<0){
                currsum = 0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println("Max subarray sum is : " + maxsum);
    }
    
}




// import java.util.*;
// public class kadans_subarray {
//     public static void kadans(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i=0;i<numbers.length;i++){
//             cs = cs + numbers[i];
//             if (cs < 0){
//                 cs=0;
//             } ms = Math.max(cs,ms);
//         }
//         System.out.println(cs+"\n"+ ms);

//     }
//     public static void main(String args[]){
//         int numbers[] = {-2,-3,4,-2,1,5,-3,1};
//         kadans(numbers);
//     }
// }