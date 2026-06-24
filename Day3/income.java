import java.util.*;
public class income {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income in Lakhs");
        int income=sc.nextInt();
        if(income < 5){
            System.out.println("No tax,Total amount is: "+income);
        }
        else if(income >=5 && income <=10){
            System.out.println("20% tax ,Total amount is"+(income*(0.2)+income));

        }
        else{
            System.out.println("30% tax,. Total income is "+(income*(0.3)+income));
        }
    }

    
}
