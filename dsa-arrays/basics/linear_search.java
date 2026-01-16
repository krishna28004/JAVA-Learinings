import java.util.*;
public class linear_search {



    // public static int linearsearch(int numbers[],int key){
    //     for(int i=0;i<numbers.length;i++){
    //         if (numbers[i]==key){
    //             return i;
    //         }
    //     }return -1;
    // }

    public static int fooditem(String menulist[],String item){
        for(int i=0;i<menulist.length;i++){
             if (menulist[i].equalsIgnoreCase(item)){
            return i;
            }
        }return -1;
    } 




    public static void main(String args[]){
        int numbers[] = {2,4,6,8,9,10,12,14,16};
        String food[] = {"dosa","vada pao", "chilli potato","samosa","hot dog", "chhole bhature"};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the food with correct spell : ");
        String select = sc.nextLine();
        

        int index = fooditem(food, select);
        if(index == -1){
            System.out.println("Not found in menu.");
        }
            else {
                System.out.println("The food is at index: " + index);
            }
    }
}
