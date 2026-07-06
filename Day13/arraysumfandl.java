import java.util.*;

class arraysumfandl{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        if (size <= 1 || size >= 10) {
            System.out.println("Invalid Array Size.");
            return;
        }

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = arr[0] + arr[size - 1];
        System.out.println(arr[0] + " + " + arr[size - 1] + " = " + sum);
    }
}