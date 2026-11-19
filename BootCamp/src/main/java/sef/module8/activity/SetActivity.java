package sef.module8.activity;

// Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("John");
        hashSet.add("John");
        hashSet.add("Harry");
        hashSet.add("Daniel");

        // TODO: 1 - Type code to create a set of names using HashSet.
        // Add "John", "John", "Harry", and "Daniel" (and try adding a few more duplicate entries).

        print(hashSet);
    }
        // TODO: 2 - Call print method to print the set passed as its parameter.



    static void print(Set set) {

    Iterator iterator = set.iterator();
    while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
        // TODO: 3 - Type code to print this set
        // Notice the order in which elements get printed and whether duplicates appear.


}