
public class MinimumNumber
{
	public static void main(String[] args) {
	    int array [] ={33,44,55,37,999,88};
	    int min = array[0];
	    for (int i=0; i>array.length; i++){
	        if (array[i]<min)
	        {
	            min= array[i];
	            
	        }
	    }
	    System.out.println(min);
	    
	}
}