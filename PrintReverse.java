import java.util.*;
public class Main {
    public static void main(String args[]) {
        //Your Code Here
        Scanner Scn = new Scanner(System.in);
        //System.out.println("Enter Number");
        long N = Scn.nextInt();
        long digit;
        long ans = 0;
        while( N != 0)
        {
            digit = N%10;
            ans = ans*10 + digit;
            N = N/10;
        }
        System.out.println(ans);
    }
}
