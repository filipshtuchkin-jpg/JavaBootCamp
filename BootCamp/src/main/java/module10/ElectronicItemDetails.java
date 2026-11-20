package module10;

import java.util.HashMap;

// class for sotring of Electronic items list and prices
public class ElectronicItemDetails {
    // method to return price of item
    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.get(name);
    }

    // main methid
    public static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();
        itemHashMap.put("TV", 1500.00);
        itemHashMap.put("Refrigerator", 800.00);
        itemHashMap.put("WashingMachine", 500.00);
        itemHashMap.put("Laptop", 1200.00);

        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
    }


}
