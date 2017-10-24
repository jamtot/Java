/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriseme;

/**
 *
 * @author jamtot
 * Memorise Me!
 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/memorise-me/
 */
import java.util.Scanner;

public class MemoriseMe {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String sN = sc.nextLine();
        int N = Integer.parseInt(sN);
        String [] sB = (sc.nextLine()).split(" ");
        int len = sB.length;
        int [] B = new int[len];
        for (int i = 0; i < len; i++)
        {
            B[i] = Integer.parseInt(sB[i]);
        }
        int Q = Integer.parseInt(sc.nextLine());
        for (int i = 0;i<Q;i++)
        {
            int A = Integer.parseInt(sc.nextLine());
            int count = 0;
            for (int a: B) 
            {
                if (a==A){count++;}
            }
            if (count > 0) System.out.println(count);
            else System.out.println("NOT PRESENT");
        }
    }
    
}
