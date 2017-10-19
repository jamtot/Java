/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplesearch;

import java.util.Scanner;

/**
 *
 * @author jamtot
 */
public class SimpleSearch {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = GetInt();
        String line = sc.nextLine();
        String [] strs = line.split(" ");
        int K = GetInt();
        int len = strs.length;
       
        for (int i = 0; i < len; i++)
        {
            if (Integer.parseInt(strs[i])==K)
            {
                System.out.println(i);
                break;
            }
        }
    }
    
    private static int GetInt()
    {
        String strInput = sc.nextLine();
	int num = Integer.parseInt(strInput);
	return num;
    }
}
