import java.util.*;
public class evenandodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int oddcount=0;
        int evencount=0;

        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            n=n/10;
        }
        System.out.println("Even Digits: "+evencount);
        System.out.println("Odd Digits: "+oddcount);

    }
    
}
