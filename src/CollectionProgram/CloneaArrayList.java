package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneaArrayList {
	public static void main(String[] args)
    {
        // Create a list
        List<String> original
            = Arrays.asList(
                "Nirbhay Gupta",
                "A Computer Engineer",
                "SDET");
  
        // Clone the list
        List<String> cloned_list
            = new ArrayList<String>(original);
  
        System.out.println(cloned_list);
    }
}
