// author: Jonathan Morris C00127042

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Extra9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int score = 0;
		List<Quiztion> questionList = new ArrayList<Quiztion>();
		questionList.add(new Quiztion("There are three letters in the word 'all'. True/False -> ", true));
		questionList.add(new Quiztion("There are five letters in the word 'plenty'. True/False -> ", false));
		questionList.add(new Quiztion("There are seven letters in the word 'seven'. True/False -> ", false));
		
		for (Quiztion q: questionList)
		{
			System.out.print(q.getQuestion());
			char tOrF = sc.next().charAt(0);
			boolean answer;
			if (tOrF == 'f' || tOrF == 'F' || tOrF == '0')
				answer = false;
			else answer = true;
			if (q.getAns() == answer)
				score++;
		}
		
		System.out.println("You scored " + score + ".");
	}	
}

class Quiztion
{
	String q;
	Boolean ans;
	public Quiztion(String question, Boolean answer)
	{
		this.q = question;
		this.ans = answer;
	}
	
	public String getQuestion(){ return q; }
	public Boolean getAns(){return ans; }
}