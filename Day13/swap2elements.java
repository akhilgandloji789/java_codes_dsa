import java.util.*;
class swap2elements
{
public static void main(String[] args)
{
Scanner sc=new
Scanner(System.in);
int n=sc.nextInt();
if(n<=1 || n>=10){
 System.out.println("Invalid Array Size.");
 return;
}
int arr[]=new int[n];
System.out.print("Before Swapping - ");
for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
 if(arr[i]==arr[n-1])
 System.out.print(arr[i]);
 else
 System.out.print(arr[i]+" ");
}
System.out.println();
System.out.print("After Swappinng - ");
int i=0;
while((i+1<=n-1)){
 int temp=arr[i];
 arr[i]=arr[i+1];
 arr[i+1]=temp;
 i+=2;
}
for(int j=0;j<n;j++){
 if(arr[j]==arr[n-1])
 System.out.print(arr[j]);
 else
 System.out.print(arr[j]+" ");
}
}
}