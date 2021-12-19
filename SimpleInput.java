import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long sum = 0;
        int N;
        while (sum >= 0)
        {
            N = scn.nextInt();
            sum += N;
            if (sum >= 0)
            {
                System.out.println(N);
            }

        } 
              
    }
}
