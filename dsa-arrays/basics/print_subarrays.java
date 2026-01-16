// import java.util.*;
// public class print_subarrays {
//     public static void main(String args[]){
//     int numbers[] = {2,4,6,8,10,12};
//     subarray(numbers);
//     }
    
//     public static void subarray(int numbers[]){
//         int sum = 0;
//         for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end = j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(numbers[k] + " ");
//                     sum = sum + numbers[k];
//                 }
//                 System.out.println();
//             }System.out.println();
//         }System.out.println("Sum: "+ sum);
// }
//     }


import java.util.*;
public class print_subarrays{
    public static void subarray_code(int arrayis[]){
        for(int i = 0; i<arrayis.length;i++){
            int start = i;
            for(int j=i;j<arrayis.length;j++){
                int end = j;
                {
                    for(int k=start;k<=end;k++){
                        System.out.print(arrayis[k] + " ");
                    }
                }System.out.println();
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the size of array: ");
        int n = sc.nextInt();
        int arrayis[] = new int[n];
        System.out.println("Give the Elements of array: ");
        for(int i=0;i<n;i++){
            arrayis[i] = sc.nextInt();
        }
        System.out.println("Your Array is:");
        System.out.println(Arrays.toString(arrayis));
        System.out.println();
        System.out.println("Subarrays are: ");
        subarray_code(arrayis);
    }
 }
