package sef.module8.activity;

// Needs to be completed
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {

    public static void main(String[] args) {
        Map names = new HashMap();
        names.put("1", "Krishna");
        names.put("2", "Rama");
        names.put("3", "Vishnu");

        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        MapActivity mapActivity = new MapActivity();
        mapActivity.print(names);
    }
    // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)



    void print(Map map) {
        Set keys = map.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            String value = (String) map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // 3 - Type code to print this map (keys and values)

    }
}