import java.util.*;
public class charvowcon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowels");
        }
        else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Vowels");
        }
        if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u'){
            System.out.println("Consonant");
        }
        else if(ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U'){
            System.out.println("consonant");
        }
        

    }
    
}
