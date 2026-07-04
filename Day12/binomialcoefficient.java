import java.util.*;
public class binomialcoefficient {
    public static int factorial(int a){
        int tot=1;
       if(a==0 ||a==1){
            tot=1;
        }
        else{
            for(int i=1;i<=a;i++){
                tot=tot*i;
            }
        }
        return tot;
    }
    public static int Bc(int n,int r){
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
        
        return a/(b*c);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int bcc=Bc(5,2);
        System.out.println(bcc);


    }
    
}
