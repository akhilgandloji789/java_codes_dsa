import java.util.*;
class alternateeven
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int size=sc.nextInt();

 if(size<=1 || size>=10){
 System.out.println("Invalid Array Size.");
 return;
 }
 int arr[]=new int [size];

 for(int i=0;i<size;i++){
 arr[i]=sc.nextInt();
 }
 int evenCount=0;
 boolean found=false;

 for(int i=0;i<size;i++){
 if(arr[i]%2==0){
 evenCount++;

 if(evenCount%2==1){
 System.out.print(arr[i]+" ");
 found=true;
 }
 }
 }
 if(!found){
 System.out.println("No even numbers in the give Array!");
 }
}
}