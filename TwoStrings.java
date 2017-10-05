/**
 * @(#)TwoStrings.java
 *
 *
 * @author 
 * @version 1.00 2017/10/5
 *
 * Two Strings
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/
 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

	static Scanner sc = new Scanner(System.in);
	
    public static void main(String args[])
    {
    	//MyInput inp = new MyInput();
    	//MyOutput out = new MyOutput();
    	int T = getInt();
    	for (int i = 0; i<T; i++)
    	{
	    	String [] str = getStrings();
	    	char [] s1 = strToChars(str[0]);
	    	char [] s2 = strToChars(str[1]);
	    	
	    	Arrays.sort(s1);
	    	Arrays.sort(s2);
	    	String str1 = new String(s1);
	    	String str2 = new String(s2);
	    	
	    	if (str1.equals(str2)){
	    		System.out.println("YES");
	    	}
	    	else {
	    		System.out.println("NO");
	    	}
    	}
    }
    
    private static char[] strToChars(String str)
    {
    	char [] chars = new char[str.length()];
	    for (int i = 0; i < chars.length; i++)
	    {
	    	chars[i] = str.charAt(i);
	    }
	    return chars;
    }
    
    public static int getInt()
	{
		String strInput = sc.nextLine();
		int num = Integer.parseInt(strInput);
		return num;
	}
	
	public static String[] getStrings()
	{
		String str = sc.nextLine();
    	String[] strs = str.split(" ");
    	return strs;
	} 
}