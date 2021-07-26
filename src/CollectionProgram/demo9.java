package CollectionProgram;

import java.util.ArrayList;

public class demo9 {
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList<>();
		list.add(101);
		list.add(500);
		list.add(201);
		list.add(25);
		list.add(333);
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list);
	}
}