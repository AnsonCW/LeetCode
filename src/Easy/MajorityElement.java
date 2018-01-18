package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * 找出陣列中出現過半數以上的元素
 * 假設陣列不為空且一定有過半數以上的元素
 *
 */
public class MajorityElement {
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		int n = (int) Math.round( nums.length * 0.5 );
        for(int i = 0; i < nums.length; i++)
        {
        	int num = nums[i];
        	int count = map.getOrDefault(num, 0) + 1;
        	if( count >= n ) return num;
        	map.put(num, count);
        }
        return 0;
    }
}
