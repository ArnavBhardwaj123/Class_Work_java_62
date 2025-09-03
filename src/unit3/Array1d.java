package unit3;
import java.util.*;

public class Array1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            System.out.println("Element at " + i +" "+ arr[i]);
        }
    }
}
