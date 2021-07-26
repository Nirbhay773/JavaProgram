package CollectionProgram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AllKeysFromHashMap {
	public static void main(String args[]) {
	      // Create hash map
	      HashMap hm = new HashMap();
	      hm.put("Wallet", new Integer(400));
	      hm.put("Belt", new Integer(500));
	      hm.put("Backpack", new Integer(1000));
	      System.out.println("Map = "+hm);
	      System.out.println("\nKeys...");
	      Set keys = hm.keySet();
	      Iterator i = keys.iterator();
	      while (i.hasNext()) {
	         System.out.println(i.next());
	      }
	      System.out.println("\nValues...");
	      Collection getValues = hm.values();
	      i = getValues.iterator();
	      while (i.hasNext()) {
	         System.out.println(i.next());
	      }
	   }
	}


