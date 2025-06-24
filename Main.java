import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = 0;
            for (int j = 1; j < n + 1; j++) {
                int c1 = 0;
                int c2 = 0;
                if (j % 2 == 0) {
                    c1++;
                } else {
                    c2++;
                }
                r = r + (c1 * a) + (c2 * b);
            }
            System.out.println(r);
        }


    }
}



