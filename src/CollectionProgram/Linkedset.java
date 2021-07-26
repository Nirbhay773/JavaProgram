package CollectionProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedset {
	public static void main(String[] args) {
		
		LinkedHashSet l1= new LinkedHashSet<>();
		l1.add(10);
		l1.add(20.56);
		l1.add('a');
		l1.add(true);
		l1.add(null);
		l1.add(10);
		
		System.out.println(l1);
		
	}

}
