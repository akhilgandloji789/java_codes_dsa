import java.util.*;
public class primerange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=sc.nextInt();
        int count=0;
        for(int i=start;i<=n;i++){
           for(int j=2;j<i;j++){
                if(i%j==0){
                    count=0;
                    break;
                }
                else
                    count=1;
           }
           if(count==1)
                        System.out.println(i);
    }
}
}
