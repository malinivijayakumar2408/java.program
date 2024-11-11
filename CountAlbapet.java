

public class CountAlbapet
{
	public static void main(String[] args) {
	    String st = "iatmeo";
	    int count = 0;
	    for(int i=0; i<st.length(); i++){
	        System.out.println(st.charAt(i));
	        switch(st.charAt(i)){
	            case 'a':
	                count=count+1;
	                break;
	            case 'e':
	                count= count+1;
	                break;
	            case 'i':
	                count=count+1;
	                break;
	            case 'o':
	                count=count+1;
	                break;
	            case 'u':
	                count=count+1;
	                break;
	                
	                
	        }
	        	    }
	        	    System.out.println(count);
		}
	}