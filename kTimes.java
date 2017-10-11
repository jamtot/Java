/**
 * @(#)kTimes.java
 *
 *
 * @author Jonathan Morris
 * @version 1.00 2017/10/11
 *
 * Repeated K Times
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/repeated-k-times/
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class kTimes 
{
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) 
    {
    	int N = getInt();
    	method2(N);
    }
    
    
	private static int getInt()
	{
		String strInput = sc.nextLine();
		int num = Integer.parseInt(strInput);
		return num;
	}
	
	private static void method2(int N)
	{ // method 1 was too slow for large inputs
		String nums = sc.nextLine();
    	String[] arr = nums.split(" ");
    	int[] ints = new int[N];
    	for (int i = 0; i < N; i++)
     	{
     		ints[i] = Integer.parseInt(arr[i]);
     	}
     	Arrays.sort(ints);
     	int cur = ints[0];
     	int count = 1;
     	int K = getInt();
     	for (int i = 1; i < N; i++)
     	{
     		if (ints[i]==cur){
     			count++;
   			} else {
   				if (count==K){
   					break;
   				} else {
   					count=1;
   					cur = ints[i];
   				}
   			}
     	}
     	System.out.println(cur);
     	
	}
	
	private static void method1(int N)
	{
		List<NumPair> numPairs = new ArrayList<NumPair>();
		
		String nums = sc.nextLine();
    	String[] arr = nums.split(" ");
    	int[] ints = new int[N];
    	numPairs.add( new NumPair( ints[0] ) );
    	for (int i = 0; i < N; i++)
     	{
     		ints[i] = Integer.parseInt(arr[i]);
     		Boolean added = false;
     		for (NumPair pair : numPairs)
     		{
     			if ( pair.GetN() == ints[i] )
     			{
     				pair.AddOne();
     				added = true;
     				break;
     			}
     		}
     		if (!added)
     			numPairs.add( new NumPair( ints[i] ) );
     	}
     	int K = getInt();
     	List<Integer> intList = new ArrayList<Integer>();
     	for (NumPair pair : numPairs)
     	{
			if (pair.GetCount() == K)
				intList.add(pair.GetN());
     	}
     	int smallest = intList.get(0);
     	for (Integer J : intList)
     	{
     		if (J<smallest)
     			smallest=J;
     	}
     	
     	//Collections.sort(intList);
     	System.out.println( smallest );
	}
	
}

class NumPair
{
	private int N, count;
	public NumPair(int N)
	{
		this.N=N;
		this.count=1;
	}
	public int GetN(){return N;}
	public void AddOne(){count++;}
	public int GetCount(){return count;}
}

