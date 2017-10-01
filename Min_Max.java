/**
 * @(#)Min-Max.java
 *
 *
 * @author Joanthan Morris
 * @version 1.00 2017/10/1
 *
 * Solution for problem Min-Max
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/min-max-3/
 *
 */

import java.util.Scanner;
import java.util.Arrays;

public class Min_Max {

    public static void main(String []  args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String Ts = sc.nextLine();
    	int T = Integer.parseInt(Ts);
    	
    	String nums = sc.nextLine();
    	String[] arr = nums.split(" ");
    	
    	int[] ints = new int[T];
    	
    	for (int i = 0; i < T; i++)
     	{
     		ints[i] = Integer.parseInt(arr[i]);
     	}
     	
    	Arrays.sort(ints);
     	int cur = ints[0];

     	block: {
	    	for (int i = 1; i < T; i++) {
	    		if ( cur == ints[i]) {
	    		} else if (cur+1 == ints[i]) {
	    			cur++;
	    		}
	    		else{
	    			System.out.print("NO");
	    			break block;	
	    		}
	    	}
	    	System.out.print("YES");
     	}
    }
    
   
}