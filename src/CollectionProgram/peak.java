package CollectionProgram;

import java.util.PriorityQueue;

public class peak{
	public static void main(String[] args) {
		PriorityQueue l1 = new PriorityQueue<>();
		
		l1.add(80);
		l1.add(60);
		l1.add(12);
		
		
		System.out.println(l1);
		
		System.out.println(l1.peek());
		System.out.println(l1);
		
		System.out.println(l1.peek());
		System.out.println(l1);
	}

}
