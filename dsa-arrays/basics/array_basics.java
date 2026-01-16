import java.util.*;
public class array_basics{
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);    
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Maths: "+ marks[0]);
        System.out.println("Chem: "+ marks[1]);
        System.out.println("Physics: "+ marks[2]);

        // marks[2] = marks[2] + 1;     or
        // marks[0] = 67;               this way we can edit in array.  

        double percentage = ((marks[0]+marks[1]+marks[2])/300.0)*100;
         System.out.printf("Percentage: %.2f%%\n", percentage);   
         
        // to print the length of array.
        System.out.print("Length of array: " + marks.length);
    }
}