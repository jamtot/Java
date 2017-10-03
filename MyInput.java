/**
 * @(#)MyInput.java
 *
 *
 * @author 
 * @version 1.00 2017/10/3
 */

import java.util.Scanner;

public class MyInput {
	
	Scanner sc;
	
	public MyInput()//InputStream sysin)
	{
		sc = new Scanner(System.in);//sysin);
	}
	
	public int getInt()
	{
		String strInput = sc.nextLine();
		int num = Integer.parseInt(strInput);
		return num;
	}
	
	
}