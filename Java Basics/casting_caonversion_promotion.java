public class casting_caonversion_promotion {
    public static void main(String args[]){
        // type conversion
        int a = 25;
        long b=a;
        System.out.println(b);

        // type casting - when we want to store lossy data
        float number=99.999f;
        int num2= (int)number;
        System.out.println(num2);

    }
    
}
