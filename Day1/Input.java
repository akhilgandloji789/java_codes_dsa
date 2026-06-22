import java.util.*;
public class Input{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        //String str=sc.next();//prints values upto space
        //System.out.println(str);

        //String name=sc.nextLine();//prints values upto new line
        //System.out.println(name);

        //int num=sc.nextInt();//prints integer values[-2^31 to 2^31-1]
        //System.out.println(num);

        //byte b=sc.nextByte();//prints byte values[-128 to 127]
        //System.out.println(b);

        //float price=sc.nextFloat();//prints float values[decimals]
        //System.out.println(price);

        // double d=sc.nextDouble();//prints double values[decimals + big numbers]
        // System.out.println(d);

        //boolean var=sc.nextBoolean();//prints boolean values[true,false]
        //System.out.println(var);  

        // short srt=sc.nextShort();//prints short values[-32768 to 32767]
        // System.out.println(srt);

        long bigNum=sc.nextLong();//prints long values[-2^63 to 2^63-1]
        System.out.println(bigNum);
    }
}