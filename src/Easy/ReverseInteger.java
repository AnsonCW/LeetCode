package Easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Excmple:
 * Input: 123  Output:  321
 * Input: -123 Output: -321
 * Input: 120  Output: 21
 * 
 * 反轉int整數
 *
 */
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-2147483628));
	}
	
	public static int reverse(int x) 
	{
		
		StringBuilder sb = new StringBuilder( String.valueOf( x ) );
		
		if( x < 0 ) sb.deleteCharAt( 0 );
		
		try {
			return x < 0 ? Integer.valueOf( sb.reverse().toString() ) * -1 : Integer.valueOf( sb.reverse().toString() );
		}
		catch( NumberFormatException e )
		{
			return 0;
		}
		
    }
	
}
