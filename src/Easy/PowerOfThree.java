package Easy;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 * 判斷數字是否為3的次方
 * 不使用迴圈及遞迴
 * 
 */
public class PowerOfThree {

	public static void main(String[] args) {
		
	
		System.out.println( isPowerOfThree(0) );
	
	}
	
	 public static boolean isPowerOfThree(int n) {
		 
		 if( n <= 0 ) return false;
		 if( 1162261467 % n == 0) return true;
		 return false;
	 }
	 
	 
}
