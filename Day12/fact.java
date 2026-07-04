import java.util.*;
public class fact {
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=factorial(a);
        System.out.println(f);

    }
    
}
