import java.util.*;
public class profitloss {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sp=sc.nextInt();
        int cp=sc.nextInt();

        if(sp>cp){
            System.out.println("Profit amount : "+(sp-cp));
        }
        else if(sp<cp){
            System.out.println("Loss amount : "+(-(sp-cp)));
        }
        else if(sp==cp){
            System.out.println("No Profit ,No Loss ");
        }
    }
    
}
