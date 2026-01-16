import java.util.*;
public class twice_value_check {
    public static void main(String args[]){
        int array1[] = {1,2,4,5,2,1};
        boolean a = question1(array1);
        System.out.println(a);

    }
    public static boolean question1(int array1[]){
        for(int i=0;i<array1.length;i++){
            for(int j=(i+1);j<array1.length;j++){
                if(array1[i]==array1[j]){
                    return true;
                }
             }   
        }  return false;
    }
}
