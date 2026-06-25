import java.util.*;
public class largestof4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        if(a>b && a>c && a>d)
            System.out.println("Largest number is: "+a);
        if(b>a && b>c && b>d)
            System.out.println("Largest number is: "+b);
        if(c>a && c>b && c>d)
            System.out.println("Largest number is: "+c);
        if(d>a && d>b && d>c)
            System.out.println("Largest number is: "+d);
        if(a==b && b==c && c==d && d==a)
            System.out.println("All are equal");
        if(a==b||b==c||c==d||d==a)
            System.out.println("two numbers are equal");

    }
    
}
