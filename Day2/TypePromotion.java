import java.util.*;
public class TypePromotion {
    public static void main(String args[]){

        char e='a';
        char f='b';
        System.out.println(e+f); // it will give the sum of ascii values of a and b


        int a=10;
        float b=20.25f;
        long c=25;
        double d=30;
        double ans = a + b + c + d;
        System.out.println(ans);


        byte x=5;
        // byte y=x*2;
        //System.out.println(y); // it will give error because x*2 is int and we cannot assign int to byte directly, we need to typecast it to byte
        byte z=(byte)(x*2);
        System.out.println(z);
    }
}
