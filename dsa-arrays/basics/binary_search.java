import java.util.*;
public class binary_search {
    public static int faster_search(int numbers[], int key){
        int start = 0; int end = numbers.length - 1;
        while (start<=end){
            int mid = (start+end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,6,8,10,11,14,25,29};
        int key = 29;
        System.out.println("index for key: " + faster_search(numbers,key));
    } 
}
