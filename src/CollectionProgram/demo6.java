package CollectionProgram;

import java.util.ArrayList;

public class demo6 {
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		list.add(101);
		list.add(500);
		list.add(201);
		list.add(25);
		list.add(333);
		
		ArrayList list2= new ArrayList<>();
		list2.add(101);
		list2.add(500);
		list2.add(33333);
		list2.add(44);
		list2.add(777);
		list.retainAll(list2);
		
		System.out.println(list);
	
		//System.out.println(list2);
		
	}

}
