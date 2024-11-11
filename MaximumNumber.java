

public class MaximumNumber
{
	public static void main(String[] args) {
	    int array [] ={33,44,55,37,999,88};
	    int max = array[0];
	    for (int i=0; i<array.length; i++){
	        if (array[i]>max)
	        {
	            max= array[i];
	            
	        }
	    }
	    System.out.println(max);
	    
	}
}