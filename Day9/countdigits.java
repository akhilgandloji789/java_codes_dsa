import java.util.*;
public class countdigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=Math.abs(n);
        int count=0;
        if (n == 0) {
            System.out.println(1);
            return;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    } 
}
