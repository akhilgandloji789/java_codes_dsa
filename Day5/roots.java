import java.util.*;
public class roots {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int d=(b*b)-4*a*c;

        if(d>0){
            System.out.println("Two Real and Distinct Roots");
        }
        else if(d==0){
            System.out.println("Two Equal Roots");
        }
        else{
            System.out.println("Imaginary Roots");
        }
    }
    
}
