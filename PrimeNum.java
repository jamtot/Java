/**
 * @(#)PrimeNum.java
 *
 *
 * @author Jonathan Morris
 * @version 1.00 2017/10/3
 *
 * My solution to:
 * Prime Number
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/
 */
import java.util.ArrayList;
import java.util.List;

public class PrimeNum {

	static List<Integer> primeList = new ArrayList<Integer>();
	
    public static void main(String[] args) {
		MyInput inp = new MyInput();
		int N = inp.getInt();
		printPrimeNums(N);
    }
        
    private static void printPrimeNums(int N)
    {
    	for (int i = 2; i<N; i++)
    	{
    		Boolean prime=true;
    		for (int j = 2; j < i; j++)
    		{
    			if (i % j ==0) 
    			{
    				prime=false;
    				break;	
    			}	
    		}
    		if (prime)
    		{
    			primeList.add(i);
    			System.out.print(i+ " ");
    		}
    	}
    }
} 
