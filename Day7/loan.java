import java.util.*;
public class loan {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int monthlysal=sc.nextInt();
        int credit=sc.nextInt();
        int c1=0,c2=0,c3=0;

        if(age>=21 && age<=60){
            c1=1;

        }
        else{
            System.out.println("Age not eligible");
        }

        if(monthlysal>=25000){
            c2=1;

        }
        else{
            System.out.println("Salary not eligible");
        }

        if(credit>=700){
            c3=1;

        }
        else{
            System.out.println("Credit score not eligible");
        }


        if((c1*c2*c3)==1){
            System.out.println("Loan Approved");
        }


    }
    
}
