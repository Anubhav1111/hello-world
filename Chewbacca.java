import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner Scn = new Scanner(System.in);
        long x = Scn.nextLong();
        long N = x;
        long digit;
        long ans = 0;
        long index = -1;
        int len = 0;
        while ( N!=0 )
        {
            len++;
            N = N/10;

        }
        while ( x!= 0)
        {
          index++;
          digit = x%10;
          if (x!=9 && digit > (9 - digit) )
          { 
           
             ans = ans + (long) (Math.pow(10, index)) *  ( 9 - digit);

          }
          else if (digit == 9 && index==len)
          {
              ans = ans + 0;
          }
          else
             ans = ans + (long) (Math.pow(10, index)) * (digit);
          x = x/10;    
        }
        //N = N - ans;
        System.out.println(ans);




        

    }
}
