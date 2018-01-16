package Easy;


/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 * 一個int陣列中，每個元素都會出現2次，找出僅出現一次的一個
 * 盡量不使用額外的記憶體
 *
 */
public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 2;
		
		
		System.out.println( singleNumber( nums ) );
		
	}
	
	public static int singleNumber(int[] nums) {
		
		Integer x = null;
		
		for( Integer i : nums )
		{
			if( x == null ) x = i;
			else x = x ^ i;
			
		}
		
		return x;
    }
	
}
