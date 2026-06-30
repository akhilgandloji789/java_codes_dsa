import java.util.*;
public class evenoddsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        while(true){
           int n=sc.nextInt();
           if(n==0){
            break;
           }
           if(n%2==0){
            evensum+=n;
           }
           else{
            oddsum+=n;
           }
        }
        System.out.println("EVEN SUM: "+evensum);
        System.out.println("ODD SUM: "+oddsum);
    }
    
}
