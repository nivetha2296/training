package ExamplePrograms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortClass {

	static Map<Integer, String> map = new HashMap<>();
	 
    // Function to sort map by Key
    public static void sortbykey()
    {
        // TreeMap to store values of HashMap
        TreeMap<Integer, String> sorted = new TreeMap<>();
 
        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);
 List<String> sort = new LinkedList<String>();
        // Display the TreeMap which is naturally sorted
        for (Map.Entry<Integer, String> entry : sorted.entrySet())
          sort.add(entry.getValue());    
        System.out.println(sort);
    }
     
    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put(1,"S");
        map.put(6,"L");
        map.put(2,"S");
        map.put(5,"M");
        map.put(8,"XL");
        map.put(7,"L");
        map.put(3,"S");
        map.put(4,"M" );
        map.put(9,"XL");
 
        // Calling the function to sortbyKey
        sortbykey();
    }
}



