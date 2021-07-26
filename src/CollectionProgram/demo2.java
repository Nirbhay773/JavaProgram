package CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class demo2 {
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		list.add("adarsh");
		list.add("skillrary");
		list.add("testyantra");
		list.add("abi");
		list.add("banglore");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
