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
import java.util.*;

public class PrimeNum {

	static List<Integer> primeList = new ArrayList<Integer>();
	
    public static void main(String[] args) {
		MyInput inp = new MyInput();
		int N = inp.getInt();
		printPrimeNums(N);
    }
        
    private static void printPrimeNums(int N)
    {
    	/*primeList.add(2);
    	primeList.add(3);
    	primeList.add(5);
    	primeList.add(7);*/
    	for (int i = 2; i<N; i++)
    	{
    		Boolean prime=true;
    		for (int j = 1; j < i; j++)
    		{
    			if (i % j ==0 && j!=1 && i!=1) 
    			{
    				//System.out.println("i: " + i + "j: " + j + " FALSE");
    				prime=false;	
    			}	
    		}
    		if (prime)
    		{
    			primeList.add(i);
    			System.out.print(i+ " ");
    		}
    	}
    	
    	/*//access via new for-loop
		for(int nums : primeList) 
		{
		    String element = Integer.toString(nums);
		    System.out.print(element+" ");
		}*/
    }
}

