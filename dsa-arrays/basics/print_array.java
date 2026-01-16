import java.util.*;
public class print_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[7];
    
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
       System.out.println("Array: " + Arrays.toString(numbers));
        
    }
    
}
