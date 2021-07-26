package CollectionProgram;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list= new ArrayList<>();
		list.add(10);
		list.add(33);
		list.add(25);
		
		ArrayList list2= new ArrayList<>();
		list.add(50);
		list.add(88);
		list.add(90);
		
		
		System.out.println(list);
		System.out.println(list2);
		 
		list.addAll(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
	}

}
