import java.util.*;
public class practice3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of Eraser: ");
        float Eraser = sc.nextFloat();
        System.out.println("Enter the price of Pen: ");
        float Pen = sc.nextFloat();
        float bill=pencil + Eraser + Pen;
        float gst= (18*bill)/100.0f;
        System.out.println("----------------------------\nThe Net price of your purchased items: " + bill);
        System.out.println("18% GST is also added");
        System.out.println("Total Payable Amount: " + (gst+bill));
        System.out.println("----------------------------");




    }
    
}
