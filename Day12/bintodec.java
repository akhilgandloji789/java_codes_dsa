import java.util.*;
public class bintodec {
    public static void decimal(int n){
        int pow=0;
        int decNum=0;

        while(n>0){
            int lastdigit=n%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(decNum);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }  
}
