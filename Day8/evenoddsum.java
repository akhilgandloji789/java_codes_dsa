//Write a program that reads a set of integers , and then prints the sum of the even and odd integers.
import java.util.*;
public class evenoddsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;

        System.out.println("Enter the digits (0 to exit)");

        while(true){
            int num=sc.nextInt();

            if(num==0){
                break;
            }

            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
        }
        System.out.println("EVEN SUM: "+evensum);
        System.out.println("ODD SUM: "+oddsum);
    }
    
}
