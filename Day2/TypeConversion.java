import java.util.*;
public class TypeConversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // code to demonstrate type conversion
        int a=10;
        double b=a; // implicit type conversion
        System.out.println("Implicit type conversion: "+b);
        double c=10.5;
        int d=(int)c; // explicit type conversion
        System.out.println("Explicit type conversion: "+d);

        //by taking scanner value
        // int e=sc.nextFloat();
        // System.out.println("You entered: "+e);
// it will give error because we cannot convert float to int directly using scanner, we need to use nextInt() for int and nextFloat() for float
        System.out.println("Enter a float value: ");
        float f=sc.nextInt();
        System.out.println("You entered: "+f);

        float x=25.12f;
        int z=(int)x;
        System.out.println("Explicit type conversion from float to int: "+z);
    }
    }
    
