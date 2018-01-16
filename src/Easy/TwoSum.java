package Easy;

import java.util.Date;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * 陣列中有兩數相加等同目標數，找出該兩數在陣列中的位置
 * 
 */
public class TwoSum {

	public static void main(String[] args) {
		
		int nums[] = new int[4];
		nums[0] = 2;
		nums[1] = 15;
		nums[2] = 11;
		nums[3] = 7;
		int target = 9;
		
		
		long star = new Date().getTime();
		int array[] = twoSum( nums, target);
		long end = new Date().getTime();
		
		System.out.println( "total:" + ( end - star ) );
		
		for( int i = 0; i < array.length ; i++ )
		{
			System.out.println(array[i]);
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int array[] = new int[2];
		
		for ( int i = 0 ; i < nums.length  ; i++ )
		{
			int c = target - nums[i];
			for ( int x = nums.length - 1 ; x > i ; x-- )
			{
				if( nums[x] == c )
				{
					array[0] = i;
					array[1] = x;
					
					return array;
				}
			}
		}
        
		return array;
    }
}
