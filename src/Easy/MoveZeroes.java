package Easy;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * 1.You must do this in-place without making a copy of the array
 * 2.Minimize the total number of operations.
 * 
 * 將陣列中的0移到陣列最後面，其餘元素保持相同順序
 * 1.在當前陣列中操作，不可新增陣列
 * 2.減少操作次數
 *
 */
public class MoveZeroes {
	
	public static void main(String[] args) {
		int nums[] = new int[10];
		nums[0] = 4;  
		nums[1] = 2;   
		nums[2] = 4;   
		nums[3] = 0;  
		nums[4] = 0; 
		nums[5] = 3;
		nums[6] = 0;
		nums[7] = 5;
		nums[8] = 1;
		nums[9] = 0;
		
		moveZeroes(nums) ;
		
		for( Integer i : nums )
		{
			System.out.println(i);
		}
	}
	
	public static void moveZeroes(int[] nums) {
		int x = 1;
		for( int i = 0; i < nums.length; i++ )
		{
			if( i+x >= nums.length ) break;
			if( nums[i] != 0 ) continue;
			if( nums[i] == nums[i+x] ) 
			{
				++x; 
				--i;
				continue;
			}
			else {
				nums[i] = (nums[i] = nums[i] ^ nums[i+x]) ^ (nums[i+x] = nums[i] ^ nums[i+x]);
			}
			
			x = 1;
		}
		
		
    }
}
