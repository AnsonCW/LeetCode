package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * 
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * 
 * 找出陣列中前K個最常出現的元素
 * 
 */
public class TopKFrequentElements {

	public static void main(String[] args) {
		int nums[] = new int[6];
		nums[0] = 2;
		nums[1] = 2;
		nums[2] = 2;
		nums[3] = 1;
		nums[4] = 1;
		nums[5] = 3;
		int k = 2;
		
		System.out.println( topKFrequent( nums, k ).toString() );
		
	}
	
public static List<Integer> topKFrequent(int[] nums, int k) {
		
		class A {
			int key;
			int value;
			public int getKey() {
				return key;
			}
			public void setKey(int key) {
				this.key = key;
			}
			public int getValue() {
				return value;
			}
			public void setValue(int value) {
				this.value = value;
			}
		}
		
        Map< Integer , Integer > map = new HashMap<>();
        List<A> list = new ArrayList<>();
        List returnlist = new ArrayList<>();
        
        for( int i : nums )
        {
        	int x = map.get(i) == null ? 0 : map.get(i) + 1;
        	map.put( i, x );
        }
        
        for( int key : map.keySet() )
        {
        	A a = new A();
        	a.setKey(key);
        	a.setValue(map.get(key));
        	list.add(a);
        }
        
        Collections.sort(list, new Comparator<A>() {
        	 @Override
        	 public int compare(A o1, A o2) {
        		 if( o1.getValue() > o2.getValue() ) return -1;
        		 if( o1.getValue() < o2.getValue() ) return 1;
				return 0;
        	 }
		});
       
        for( int i = 0; i < k ; i++ )
        {
        	returnlist.add( list.get(i).getKey() );
        }
      
        return returnlist;
    }
}
