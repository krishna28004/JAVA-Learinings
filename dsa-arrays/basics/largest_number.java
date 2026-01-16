// import java.util.*;
// public class largest_number {
//     public static int large_num(int numbers[]){
//         int largest =Integer.MIN_VALUE; //-INFINITY
//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];
//             }
//         }
//         return largest;    
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,5,6,3,7,9,8,11,10,1};
//         System.out.print("largest value is: " + large_num(numbers));
//     }
// }

import java.util.*;
public class largest_number {
    public static int largest_num(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest = numbers[i];
            }
        } return largest;
    }
public static void main(String args[]){
    int numbers[] = {1,2,5,6,7,8,9,10,11,12,4,3};
    int a = largest_num(numbers);
    System.out.println("Largest number is: " + a);
    }
}
