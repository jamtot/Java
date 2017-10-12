/**
 * @(#)Min-Max2.java
 *
 *
 * @author Jonathan Morris
 * @version 1.00 2017/10/12
 *
 * Min-Max
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/min-max-8/
 */

import java.util.Scanner;

public class Min_Max2 {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String [] args) 
    {
    	int N = getInt();
    	int cur,min,max;
    	String num_string = sc.nextLine();
    	int total = 0;
    	String [] strs = new String[N];
    	
    	strs = num_string.split(" ");
    	min = max = Integer.parseInt(strs[0]);
    	
    	for (String n : strs)
    	{
    		cur = Integer.parseInt(n);
    		total += cur;
    		if (cur < min) min = cur;
    		else if (cur > max) max = cur;
    	}
    	System.out.println((total-max) + " " + (total-min));
    }
    
    private static int getInt()
	{
		String strInput = sc.nextLine();
		int num = Integer.parseInt(strInput);
		return num;
	}
}