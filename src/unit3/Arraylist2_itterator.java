package unit3;

// Iterator with ArrayList:
// ✅ Pros:
// 1. Easy way to loop through elements
// 2. Can safely remove elements while iterating
// 3. No need to manage index manually

// ❌ Cons:
// 1. Only forward traversal (use ListIterator for both directions)
// 2. Cannot directly jump to an element by index
// 3. Slightly slower than normal for-each loop


import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist2_itterator {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            products.add(sc.next());
        }
        Iterator itr = products.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        Collections.sort(products);
        products.addLast("lichi");
        products.addFirst("apple");
        products.add(3,"papaya");
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());


    }
}
