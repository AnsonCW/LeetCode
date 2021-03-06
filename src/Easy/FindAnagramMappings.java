package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two lists A and B, and B is an anagram of A. 
 * B is an anagram of A means B is made by randomizing the order of the elements in A.
 * We want to find an index mapping P, from A to B. 
 * A mapping P[i] = j means the ith element in A appears in B at index j.
 * These lists A and B may contain duplicates. 
 * If there are multiple answers, output any of them.
 * 
 * For example, given
 * A = [12, 28, 46, 32, 50]
 * B = [50, 12, 32, 46, 28]
 * 
 * We should return
 * [1, 4, 3, 2, 0]
 * 
 * as P[0] = 1 because the 0th element of A appears at B[1],
 * and P[1] = 4 because the 1st element of A appears at B[4], 
 * and so on.
 * 
 * Note:
 * 1.A, B have equal lengths in range [1, 100].
 * 2.A[i], B[i] are integers in range [0, 10^5].
 * 
 * 給AB兩個陣列，A陣列亂數排序後出現B陣列，回傳陣列為A陣列的元素為B陣列的第幾個index
 * 
 *
 */
public class FindAnagramMappings {

	public static void main(String[] args) {
		int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
		
		System.out.println(Arrays.toString(anagramMappings(A,B)));
	}
	
    public static int[] anagramMappings(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < B.length; i++)
        {
        	map.put(B[i], i);
        }
        for(int i = 0; i < A.length; i++)
        {
        	B[i] = map.get(A[i]);
        }
        
        return B;
    }
}
