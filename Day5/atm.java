import java.util.*;
public class atm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int accbal=sc.nextInt();
        int withdrawamt=sc.nextInt();

        if(withdrawamt<=0)
            System.out.println("Invalid Withdrawal Amount");
        else if(withdrawamt>accbal){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: "+(accbal-withdrawamt));
        }
    }
    
}
