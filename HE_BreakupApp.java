/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package he_breakupapp;

// author Jonathan Morris
// Breakup App
// https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/breakup-app/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class HE_BreakupApp {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		List<DateWeight> DWs = new ArrayList<DateWeight>();
		int N = getInt();
		
		for (int i = 0; i < N; i++)
		{
			int multiplyer = 1;
			String text = sc.nextLine();
			if (text.charAt(0)=='G') multiplyer = 2;
			String [] substrings = text.split(" "); 
			for (String sub : substrings)
			{
				if (isNumeric(sub))
				{
					int current = Integer.parseInt(sub);
					int size = DWs.size();
					if (size > 0)
					{
						boolean adding=true;
						for (int j = 0; j < size; j++)
						{
							if (DWs.get(j).GetDate()==current)
							{
								DWs.get(j).AddWeight(1*multiplyer);
								adding=false;
								break;
							}
						}
						if (adding) 
						{
							DWs.add(new DateWeight(current, 1*multiplyer));
						}
					}
                                        else {
                                            DWs.add(new DateWeight(current, 1*multiplyer));
                                        }
				}	
			}	
		}
		
		Collections.sort(DWs, new CustomComparator());
		Collections.reverse(DWs);
		
		int finalSize = DWs.size();
		boolean matching = false;
		int date=0,maxWeight=0;
		if (finalSize>1)
		{
                    maxWeight = DWs.get(0).GetWeight();
                    date = DWs.get(0).GetDate();
                    
                    for (int i = 1; i < finalSize; i++)
                    {
                        int curWeight = DWs.get(i).GetWeight();
                        if ( curWeight < maxWeight ) 
                        {
                            break;
                        }
                        else if (curWeight == maxWeight) 
                        {
                            matching = true;
                            break;
                        }
                    }
		}
		if ((date==19 || date==20) && !matching)
		{
                    System.out.println("Date");
		}
		else System.out.println("No Date");
		
	}
	
	private static int getInt()
	{
		String strInput = sc.nextLine();
		int num = Integer.parseInt(strInput);
		return num;
	}
	
	private static boolean isNumeric(String str)
	{
		try { Integer.parseInt(str); }
		catch(NumberFormatException e) { return false; }
		return true;
	}
}

class DateWeight {
	
	private int date, weight;
	public DateWeight(int date, int weight)
	{
		this.date=date;
		this.weight=weight;
	}
	public int GetDate() {return date;}
	public int GetWeight() {return weight;}
	public void AddWeight(int additional_weight) {weight+=additional_weight;}
}

class CustomComparator implements Comparator<DateWeight> {
    @Override
    public int compare(DateWeight DW1, DateWeight DW2) {
    	Integer weight1 = new Integer(DW1.GetWeight());
    	Integer weight2 = new Integer(DW2.GetWeight());    	
        return weight1.compareTo(weight2);
    }
}
