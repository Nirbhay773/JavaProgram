package CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class demo4 {
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		list.add(101);
		list.add(500);
		list.add(200);
		list.add(25);
		list.add(33);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
