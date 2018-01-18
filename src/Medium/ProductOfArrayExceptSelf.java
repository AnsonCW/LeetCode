package Medium;

import java.util.Arrays;

/**
 * Given an array of n integers where n > 1, nums, 
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 *
 * 給一個大於一個元素的陣列，
 * 回傳陣列等同除本身以外其餘元素相乘
 * 
 *
 */
public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {2,3,4,5,6};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
	public static int[] productExceptSelf(int[] nums) {
		
		int[] a1 = new int[nums.length-1];
		int[] a2 = new int[nums.length-1];
		
		a1[0] = nums[0];
		a2[0] = nums[nums.length-1];
		
		for(int i=1; i < nums.length -1; i++)	
		{
			a1[i] = nums[i] * a1[i-1];
			a2[i] = nums[nums.length -1 - i] * a2[i-1];
		} 
		nums[0] = a2[a2.length -1];
		nums[nums.length -1] = a1[a1.length -1];
		
		for(int i = 1; i < a1.length; i++)
		{
			nums[i] = a1[i-1] * a2[a2.length-1-i];
		}
		
        return nums;
    }
}
