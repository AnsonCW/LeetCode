package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * 
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * 找出陣列中最長的連續數字，回傳長度
 *
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {};

		System.out.println(longestConsecutive(nums));
	}
	
	public static int longestConsecutive(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		Arrays.sort(nums);
		int r = 1;
		List<Integer> list = new ArrayList<>();
		for(int i = nums.length -1; i > 0; i--)
		{
			if(nums[i] -1 == nums[i-1]) 
			{
				r++;
			}
			else if(nums[i] == nums[i-1])
			{
				continue;
			}
			else 
			{
				list.add(r); 
				r = 1;
			}
		}
		list.add(r);
		Collections.sort(list);
		return list.get(list.size()-1);
	}
}
