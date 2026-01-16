public class array_as_function {
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
   public static void main(String args[]) {
    int marks[] = {45,66,67};
    update(marks);
   
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i] + " ");
    }
    System.out.println();
   }
}
