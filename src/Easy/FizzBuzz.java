package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.  
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 * 
 * 回傳  1 到  n 的數字
 * 若為3的倍數改成 "Fizz"
 * 若為5的倍數改成 "Buzz"
 * 同時為3跟5的倍數改成"FizzBuzz"
 * 
 */
public class FizzBuzz {
	
	public static void main(String[] args) {
		List<String> list = fizzBuzz(30);
		for( String l : list )
		{
			System.out.println(l);
		}

	}
	
	public static List<String> fizzBuzz(int n) {
		
		ArrayList<String> list = new ArrayList<String>();
        
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        
        for( int i = 1; i <= n; i++ )
        {
        	
        	boolean five = i % 5 == 0;
        	boolean three = i % 3 == 0;
        	
        	if( five && three )
        	{
        		list.add( Fizz + Buzz );
        		continue;
        	}
        	else if( three )
        	{
        		list.add( Fizz );
        		continue;
        	}
        	else if( five )
        	{
        		list.add( Buzz );
        		continue;
        	}
        	else {
        		list.add( "" +  i );
        	}
        }
        
        return list;
    }
}
