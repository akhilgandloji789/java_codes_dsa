import java.util.*;
public class gcd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min;
        if(a<b){
            min=a;
        }
        else{
            min=b;
        }
        int gcd=1;

        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
    
}
