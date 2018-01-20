package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, 
 * output a list of every possible self dividing number, 
 * including the bounds if possible.
 * 
 * Example 1:
 * Input: left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 *
 * 給一個範圍找出能被自己的本身的數字整除的數，不允許有0的數
 * ex: 128能同時被 1,2,8整除
 * 
 */
public class SelfDividingNumbers {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(selfDividingNumbers(1,22).toArray()));
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++)
        {
        	int remainder = i;
        	int quotient = i;
        	boolean flag = false;
        	while(quotient != 0)
        	{
        		remainder = quotient % 10;
        		if( remainder != 0 && i % remainder == 0)
        		{
        			quotient /= 10;
        		}
        		else {
        			flag = true;
        			break;
        		}
        	}
        	if(flag) continue;
        	list.add(i);
        }
        
        return list;
    }
}
