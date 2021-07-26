package CollectionProgram;

public class ReadLastElement {
	public static void main(String args[]) {
		  
	      // Creating an empty LinkedList
	      LinkedList list = new LinkedList();
	  
	      // Using add() method to add elements in the list
	      list.add("Nirbhay");
	      list.add("Gupta");
	      list.add("sdet");
	      list.add("10");
	      list.add("20");
	  
	      // Displaying the list
	      System.out.println("LinkedList:" + list);
	        
	      // Fetching last element from the list
	      System.out.println("The last element is: " + list.getLast());
	   }
	}


