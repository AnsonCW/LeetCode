package Medium;

import java.util.Arrays;

/**
 * Given an array of numbers nums, 
 * in which exactly two elements appear only once and all the other elements appear exactly twice. 
 * Find the two elements that appear only once.
 * 
 * For example: Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * 
 * Note:
 * 1.The order of the result is not important. So in the above example, [5, 3] is also correct.
 * 2.Your algorithm should run in linear runtime complexity. 
 *   Could you implement it using only constant space complexity?
 *
 * 給一個int陣列，其中有兩個元素僅出現一次，其餘元素會出現兩次，找出那兩個元素
 * 
 *
 */
public class SingleNumberIII {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(singleNumber(nums)));
	}
	
	public static int[] singleNumber(int[] nums) {
        int[] ret = new int[2];
        Arrays.sort(nums);
        int n = nums.length -1;
        for(int i = 0,c = 0; i <= n; i++)
        {
        	if(i < n && nums[i] == nums[i+1]) i++;
        	else { ret[c] = nums[i]; c++; }
        	if(i == n && ret.length != 2) ret[c] = nums[n];
        }
        return ret;
    }
}
