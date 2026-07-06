import java.util.*;
class frequencyarray{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();

 if(n<=0){
 System.out.println("Invalid Input");
 return;
 }
 int arr[]=new int[n];

 for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();

 if(arr[i]<=0){
 System.out.println("Invalid Input");
 return;
 }
 }
 boolean visited[]=new boolean[n];
 for(int i=0;i<n;i++){
 if(visited[i])
 continue;
 int count =1;

 for(int j=i+1;j<n;j++){
 if(arr[i]==arr[j]){
 count++;
 visited[j]=true;
 }
 }
 System.out.println(arr[i] + " - "+count);
 }
 }
}
