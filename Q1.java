import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array -->");
        int n = s.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
          arr[i] = s.nextInt();
        }
        System.out.println("Enter target number -->");
        int target = s.nextInt();
        for (int i = 0; i < n-1; i++) {
          for (int j = i+1; j < n; j++) {
            if (arr[i] + arr[j] == target) {
                System.out.println(i);
                System.out.println(j);
            }
          }
           
        }
    }
}