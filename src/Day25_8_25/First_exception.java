package Day25_8_25;
import java.util.*;
public class First_exception {
    public static void main(String[] args) {
        int a , b , z=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integer: ");
        a = sc.nextInt();
        b= sc.nextInt();
        try{
            z = a/ b;
        }
//        the thing too learn in exception is that catch cant  be above the try
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(z);
        }
    }
}
