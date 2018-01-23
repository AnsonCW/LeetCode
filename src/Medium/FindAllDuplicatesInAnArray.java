package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * 
 * Find all the elements that appear twice in this array.
 * 
 * Could you do it without extra space and in O(n) runtime?
 * 
 * Example:
 * Input:  [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 * 
 * 給一個int陣列為1 ≤ a[i] ≤ n (n = 陣列的長度)，
 * 陣列中相同元素可能出現一次或兩次，
 * 找出陣列中出現兩次的元素
 *
 */
public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		int nums[] = {10,2,5,10,9,1,1,4,3,7};
		System.out.println(Arrays.toString(findDuplicates(nums).toArray()));
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
        	int j = Math.abs(nums[i]);
        	System.out.println("i:" + i);
        	System.out.println("j:" + j);
        	if(nums[j-1] > 0) nums[j-1] = -nums[j-1];
        	else if(nums[j-1] < 0) res.add(j);
        	System.out.println("+++++++++++++++");
        }
        return res;
    }
}
