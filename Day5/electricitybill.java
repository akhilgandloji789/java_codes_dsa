import java.util.*;
public class electricitybill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int perunit=0;
        
        if(units>=0 && units<=100){
            perunit=2;
        }
        else if(units>=101 && units<=200){
            perunit=3;
        }
        else if(units>200){
            perunit=5;
        }
        int total=units*perunit;
        System.out.println("Bill: "+total);

    }
}  
