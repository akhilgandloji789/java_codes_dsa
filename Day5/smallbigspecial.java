import java.util.*;
public class smallbigspecial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase Alphabet");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
    
}
