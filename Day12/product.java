import java.util.*;
public class product {
    public static int products(int a,int b){
        int pro=a*b;
        return pro;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int pro=products(a,b);
        System.out.println(pro);
        
    }
    
}
