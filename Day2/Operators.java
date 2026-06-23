import java.util.*;
public class Operators {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Artihmetic operators
        // code to demonstrate operators
        int a=10;
        int b=20;
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b));
        System.out.println("a%b: "+(a%b));

        // by taking scanner value
        System.out.println("Enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("x+y: "+(x+y));
        System.out.println("x-y: "+(x-y));
        System.out.println("x*y: "+(x*y));
        System.out.println("x/y: "+(x/y));
        System.out.println("x%y: "+(x%y));

        //unary operators
        //++ increment operator & -- decrement operator
        //pre increment (++c) increment and use & post increment use and increment(c++)
        //pre decrement (--c) increment and use & post decrement use and increment(c--)
        int c=10;
        System.out.println("c: "+c);
        System.out.println("c++: "+(c++));
        System.out.println("c: "+c);
        System.out.println("--c: "+(--c));

        int A=10;
        int B=A++;
        System.out.println(A);
        System.out.println(B);

    }
    
}
