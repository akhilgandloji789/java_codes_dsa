import java.util.*;
public class multiplesof3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        for(int i=3;i<=n;i+=3){
            if(i%3==0){
                count++;
            }
        }
        System.out.println(count);
    } 
}
