package CollectionProgram;

import java.util.HashMap;

public class ValueInHashmap {
	public static void main(String[] args)
    {
  
        
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
        
        hash_map.put(10, "Nirbhay");
        hash_map.put(15, "5");
        hash_map.put(20, "Gupta");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
     
        System.out.println("Initial Mappings are: " + hash_map);
  
        
        System.out.println("Is the value 'Nirbhay' present? " + 
        hash_map.containsValue("Gupta"));
  
       
        System.out.println("Is the value 'World' present? " + 
        hash_map.containsValue("World"));
    }
}

