/**
 * @(#)SeatingArrangement.java
 *
 *
 * @author Jonathan Morris
 * @version 1.00 2017/10/9
 *
 * Seating Arrangement
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/
 *
 */

import java.util.Scanner;

public class SeatingArrangement 
{
	static SeatPair[] seatPairs = new SeatPair[6];
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) 
    {
    	seatPairs[0] = new SeatPair(1,12,"WS");
		seatPairs[1] = new SeatPair(2,11,"MS");
		seatPairs[2] = new SeatPair(3,10,"AS");
		seatPairs[3] = new SeatPair(4,9,"AS");
		seatPairs[4] = new SeatPair(5,8,"MS");
		seatPairs[5] = new SeatPair(6,7,"WS");
	
		int T = getInt();
		for (int i = 0; i < T; i++)
		{
			int S = getInt();
			int newS=((S-1)%12)+1;
			int diff = S-newS;
			for (int j = 0; j < seatPairs.length; j++)
			{
				if (seatPairs[j].getL()==newS)
				{
					System.out.println((seatPairs[j].getR()+diff) + " " + seatPairs[j].getType());
					break;
				}
				else if  (seatPairs[j].getR()==newS)
				{
					System.out.println((seatPairs[j].getL()+diff) + " " + seatPairs[j].getType());
					break;
				}
			}			
		}
    }
    
    public static int getInt()
	{
		String strInput = sc.nextLine();
		int num = Integer.parseInt(strInput);
		return num;
	}
    
    
}

class SeatPair
{
	private int l;
	private int r;
	private String type;
	public SeatPair(int l, int r, String type)
	{
		this.l=l;
		this.r=r;
		this.type=type;
	}
	public int getL(){ return l; }
	public int getR(){ return r; }
	public String getType(){ return type; }
	public void setL(int l){ this.l=l; }
	public void setR(int r){ this.r=r; }
	public void setType(String t){ this.type=t; }
}	
