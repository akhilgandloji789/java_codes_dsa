import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double income=sc.nextDouble();
        double tax=0;

        if(income>=0 && income<=250000){
            tax=tax+(income*0);
        }
        else if(income>=250001 && income<=500000){
            tax=tax+((income*5)/100);
        }
        else if(income>=500001 && income<=1000000){
            tax=tax+((income*20)/100);
        }
        else if(income>1000000){
            tax=tax+((income*30)/100);
        }

        System.out.println("Total tax: "+tax);

    }
    
}
