public class Expection
{
	public static void main(String[] args) {
	    try{
	    String a = null;
	   

		System.out.println(a.length());
	        
	    }
		catch(NullPointerException s)
		{
		   System.out.println(s); 
		}
	}
}