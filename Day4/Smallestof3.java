import java.util.*;
public class Smallestof3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if( a<b && a<c)
            System.out.println("Smallest number is: "+a);
        else if(b<c && b<a)
            System.out.println("Smallest number is: "+b);
        else if(c<a && c<b)
            System.out.println("Smallest number is: "+c);
    }
    
}
