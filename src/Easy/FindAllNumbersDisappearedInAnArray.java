package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? 
 * You may assume the returned list does not count as extra space.
 * 
 * Example:
 * Input:[4,3,2,7,8,2,3,1]
 * Output:[5,6]
 *
 * 給一個int陣列為1 ≤ a[i] ≤ n (n = 陣列的長度)，
 * 陣列中相同元素可能出現兩次，
 * 找出1到n之中沒有出現的元素
 *
 */
public class FindAllNumbersDisappearedInAnArray {
	
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(Arrays.toString(findDisappearedNumbers(nums).toArray()));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 1, j = 0; i <= n; i++)
        {
        	if( j < n-1 && nums[j] == nums[j+1]) j++;
        	if( j < n  && nums[j] == i ) j++;
        	else if( j < n  && nums[j] < i ) { j++; i--; }
        	else list.add(i);
        }
        return list;
    }
}
