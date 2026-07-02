import java.util.*;
public class largestdigit {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int max=n%10;

        while(n>0){
            int rem=n%10;
            if(rem>max){
                max=rem;
            }
            n=n/10;
        }
        System.out.println(max);

    }
    
}
