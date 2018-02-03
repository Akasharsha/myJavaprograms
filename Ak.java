package training1;

public  class Ak {
	public static void main(String[] args) {
		
		String a="Akasharsha";
		String r= reverseString(a);
		System.out.println(r);
		
		
		}
	 public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }



	}
	


