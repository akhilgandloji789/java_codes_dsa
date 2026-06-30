import java.util.*;
public class login {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        String password=sc.next();

        String adminusername="admin";
        String passwordadmin="java123";

        if(((username).equals(adminusername)) && ((password).equals(passwordadmin))){
            System.out.println("Login successfull");
        }
        else{
            System.out.println("Invalid Username or Password");
        }
    }
}
