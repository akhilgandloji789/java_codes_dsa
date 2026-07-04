import java.util.*;
public class prime {
    public static int primen(int n){
        if(n==1){
            return 0;
        }
        int flag=1;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=0;
                    break;
                }
            }
        
        return flag;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(primen(n)==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
    
}
