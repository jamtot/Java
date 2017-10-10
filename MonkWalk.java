/**
 * @(#)MonkWalk.java
 *
 *
 * @author 
 * @version 1.00 2017/10/10
 *
 * Monk Takes a Walk
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/monk-takes-a-walk/
 */
 
import java.util.Scanner;

public class MonkWalk {

	static Scanner sc = new Scanner(System.in);
	static char [] vowels = {'A','E','I','O','U','a','e','i','o','u'};
	
    public static void main(String[] args) 
    {
    	int T = getInt();
		for (int i = 0; i < T; i++)
		{
			String str = sc.nextLine();
			char[] chars = strToChars(str);
			int count = 0;
			for (int j = 0; j< chars.length; j++)
			{
				for (int k = 0; k < vowels.length; k++)
				{
					if (chars[j]==vowels[k])
					{
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
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
	
	private static char[] strToChars(String str)
    {
    	char [] chars = new char[str.length()];
	    for (int i = 0; i < chars.length; i++)
	    {
	    	chars[i] = str.charAt(i);
	    }
	    return chars;
    }
    
}