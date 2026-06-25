import java.util.*;
public class temperature {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double temp=1;

        String fever=(temp>100.0)?"Fever":"No Fever";

        System.out.println(fever);
    }
    
}
