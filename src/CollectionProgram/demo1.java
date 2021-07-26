package CollectionProgram;

import java.util.ArrayList;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list= new ArrayList<>();
		list.add("adarsh");
		list.add("skillrary");
		list.add("testyantra");
		list.add("adarsh");
		
		int count=0;
		for(int i=0;i<list.size();i++) {
			if (list.get(i).equals("adarsh")) {
				count++;
			}
		}
		
		
		
		System.out.println("total time"+count);
		
		
	}

}
