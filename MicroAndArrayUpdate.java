package microandarrayupdate;
/*
 * @author Jonathan Morris
Micro and Array Update
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/
 */
import java.util.Scanner;
public class MicroAndArrayUpdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sT = sc.nextLine();
        int T = Integer.parseInt(sT);
        for (int i = 0; i < T; i++)
        {
            String [] inputs = (sc.nextLine()).split(" ");
            int N = Integer.parseInt(inputs[0]);
            int K = Integer.parseInt(inputs[1]);
            String [] arrayInputs = (sc.nextLine()).split(" ");
            int lowest = Integer.MAX_VALUE;
            for (String s:arrayInputs)
            {
                int a = Integer.parseInt(s);
                if (a < lowest) lowest = a;
            }
            if (K<lowest)
                System.out.println(0);
            else
                System.out.println((K-lowest));
        }
    }
    
}
