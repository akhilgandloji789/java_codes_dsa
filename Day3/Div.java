import java.util.Scanner;

class Solution {
    public int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

public class Div {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.divide(dividend, divisor));

        sc.close();
    }
}