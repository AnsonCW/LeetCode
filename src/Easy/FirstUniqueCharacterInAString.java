package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, 
 * find the first non-repeating character in it and return it's index. 
 * If it doesn't exist, return -1.
 * 
 * Example
 * s = "leetcode" return 0.
 * s = "loveleetcode", return 2.
 * 
 * Note: You may assume the string contain only lowercase letters.
 * 
 * 
 * 查詢第一個沒有重複的字元，回傳index
 * 若都重複回傳-1
 * Note: 假設字串都是小寫英文
 *
 */
public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		String s = "";
		System.out.println(firstUniqChar(s));
	}
	
	 public static int firstUniqChar(String s) 
	 {
		if(s.isEmpty()) return -1;
		Map<String,Integer> map = new HashMap<>();
		String[] sa = s.split(""); 
	    for(String st : sa)
	    {
	    	map.put(st, map.getOrDefault(st, 0) + 1);
	    }
	    for(int i = 0; i < sa.length; i++)
	    {
	    	if(map.getOrDefault(sa[i],0) == 1) return i;
	    }
	    
	    return -1;
	 }
}
