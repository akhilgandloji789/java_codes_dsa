import java.util.*;
public class posorneg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0)
            System.out.println("Postitive");
        else if(num==0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        
    }
    
}
