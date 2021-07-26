package StringProgram;

public class LengthofString {
	public static void main(String args[]){
		 
		  String Saurabhsinha="This is Nirbhay Gupta";
		  System.out.println("length of NirbhayGupta string :"+getLengthOfStringWithCharArray(Saurabhsinha));
		  }
		 
		public static int getLengthOfStringWithCharArray(String str)
		 {
		  int length=0;
		  char[] strCharArray=str.toCharArray();
		  for(char c:strCharArray)
		  {
		   length++;
		  }
		  return length;
		 }

}
