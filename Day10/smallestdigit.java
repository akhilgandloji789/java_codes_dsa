import java.util.*;
public class smallestdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=n%10;

        while(n>0){
            int rem=n%10;
            if(rem<min){
                min=rem;
            }
            n/=10;
        }
        System.out.println(min);
    }
    
}
