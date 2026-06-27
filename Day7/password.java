import java.util.*;
public class password {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String pw=sc.next();

        if(pw.length()<6){
            System.out.println("Weak passowrd");
        }
        else if(pw.length()>=6 && pw.length()<=10){
            System.out.println("Medium password");
        }
        else if(pw.length()>10){
            System.out.println("Strong password");
        }
    }
    
}
