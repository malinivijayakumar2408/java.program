public class FibonicSeries
{
	public static void main(String[] args) v   

	    int a=-1;
	    int b=1;
	    int c=0;
	    int n=5;
	    for(int i=0; i<=5; i++){
	        c=a+b;
	        a=b;
	        b=c;
	        System.out.println(c);
	    }
	}
}	