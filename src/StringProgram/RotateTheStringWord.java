package StringProgram;

public class RotateTheStringWord {
	 static String leftrotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            return ans;
	    }
	 
	    // function that rotates s towards right by d
	    static String rightrotate(String str, int d)
	    {
	            return leftrotate(str, str.length() - d);
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	            String str1 = "NirbhayGupta";
	            System.out.println(leftrotate(str1, 2));
	 
	            String str2 = "NirbhayGupta";
	            System.out.println(rightrotate(str2, 2));
	    }
	}


