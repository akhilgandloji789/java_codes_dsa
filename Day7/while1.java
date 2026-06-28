import java.util.*;
public class while1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        int num=1;
        int sum=0;
        while(num<=end){
            sum=sum+num;
            num++;
        }
        System.out.println(sum);
    }
}
