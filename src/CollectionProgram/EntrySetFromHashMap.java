package CollectionProgram;

import java.util.HashMap;

public class EntrySetFromHashMap {
	public static void main(String[] args)
    {
  
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
        
        hash_map.put(10, "Nirbhay");
        hash_map.put(15, "2");
        hash_map.put(20, "Sdet");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
        
        System.out.println("Initial Mappings are: " + hash_map);
  
        
        System.out.println("The set is: " + hash_map.entrySet());
    }
}

