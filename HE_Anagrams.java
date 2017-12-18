/**
 *
 * @author Joanthan Morris
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/anagrams-651/
 * Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :

test cases,t
two strings a and b, for each test case
Output:

Desired O/p

Constraints :

string lengths<=10000

Note :

Anagram of a word is formed by rearranging the letters of the word.

For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.

SAMPLE INPUT 
1
cde
abc
SAMPLE OUTPUT 
4
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create 2 maps to count the occurences of each letter
        
        int T = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < T; t++)
        {
            Map<Character,Integer> m1 = new HashMap<Character,Integer>();
            Map<Character,Integer> m2 = new HashMap<Character,Integer>();

            char [] str1 = sc.nextLine().toCharArray();
            char [] str2 = sc.nextLine().toCharArray();

            int len1 = str1.length, len2 = str2.length, usable = 0;

            //populating the first map
            for (int i = 0; i < len1; i++)
            {
                if (m1.containsKey(str1[i]))
                    m1.replace(str1[i], m1.get(str1[i])+1);
                else
                    m1.put(str1[i], 1);
            }

            //populating the second map
            for (int i = 0; i < len2; i++)
            {
                if (m2.containsKey(str2[i]))
                    m2.replace(str2[i], m2.get(str2[i])+1);
                else
                    m2.put(str2[i], 1);
            }

            for (Character key : m1.keySet())
            {
                if (m2.containsKey(key))
                {
                    int v1 = m1.get(key);
                    int v2 = m2.get(key);
                    if (v2!=v1)
                    {
                        usable+=((v1+v2)-Math.abs(v2-v1))/2;
                    }
                    else
                    {
                        usable+=v1;
                    }
                }
            }
            System.out.print((len1+len2)-(usable*2));
        }
    }
}
