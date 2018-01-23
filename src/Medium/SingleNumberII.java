package Medium;

import java.util.Arrays;

/**
 * Given an array of integers, 
 * every element appears three times except for one,
 * which appears exactly once. Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. 
 * Could you implement it without using extra memory?
 *
 * 一個int陣列中，每個元素都會出現3次，找出僅出現一次的一個
 * 盡量不使用額外的記憶體
 */
public class SingleNumberII {

	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,2,3,5,5,5,8,8,8,0,0,0};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		Integer x = null;
		int n = nums.length;
		for(int i = 0; i < n; i++)
		{
			if(x == null) x = nums[i];
			if(i < n-1 && x == nums[i+1]) {
				i+=2;
				x = null;
			}
		}
        return x;
    }
}
