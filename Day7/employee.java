import java.util.*;
public class employee {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float sal=sc.nextFloat();
        float hra=sal*0.2f;
        float da=sal*0.5f;
        float pf=sal*0.12f;
        float gs=sal+hra+da;
        float netsal=gs-pf;

        System.out.println("Basic Salary : "+sal);
        System.out.println("HRA          : "+hra);
        System.out.println("DA           : "+da);
        System.out.println("PF           : "+pf);
        System.out.println("Gross Salary : "+gs);
        System.out.println("Net Salary   : "+netsal);
    }
    
}
