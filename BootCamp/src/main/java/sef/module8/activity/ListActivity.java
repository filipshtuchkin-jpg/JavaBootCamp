package sef.module8.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {

        List<String>names=new ArrayList<>();

        // TODO: 1 - Type code to create a list of names. Use ArrayList.

        names.add("John");
        names.add("Jane");
        names.add("Harry");
        names.add("Daniel");

    // Add "John", "John", "Harry", and "Daniel" to the list.


        // TODO: 2 - Call print method to print the list passed as its parameter.
       print(names);

    }

    static void print(List list) {



        // TODO: 3 - Type code to print this list
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Notice the order in which elements get printed.

    }

}
