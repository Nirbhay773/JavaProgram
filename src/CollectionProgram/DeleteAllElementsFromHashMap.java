package CollectionProgram;

import java.util.HashMap;

public class DeleteAllElementsFromHashMap {
	public static void main(String args[]) {
 
	      HashMap hm = new HashMap();
	      hm.put("Wallet", new Integer(1000));
	      hm.put("Belt", new Integer(500));
	      hm.put("Backpack", new Integer(1500));
	      System.out.println("Map = "+hm);
	      hm.clear();
	      System.out.println("Map after removing all elements (blank)= "+hm);
	   }
	}

