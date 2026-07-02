import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int arm=0;
        
        while(n>0){
            int rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(arm==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
    
}
