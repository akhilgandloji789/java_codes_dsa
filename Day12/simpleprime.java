import java.util.*;
public class simpleprime {
    public static boolean isPrime(int n){
        //corner cases
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}

