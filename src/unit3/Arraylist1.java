package unit3;

// ArrayList in Java:
// 1. Dynamic resizable array
// 2. Maintains insertion order
// 3. Allows duplicates
// 4. Fast random access (get/set)
// 5. Slow insert/delete in middle (shifting needed)

import java.util.*;
public class Arraylist1 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> products = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            products.add(sc.next());
        }
        System.out.println(products);
 

    }
}
