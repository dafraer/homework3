import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Input the size of the array:");
        int n;
        n = scanner.nextInt();     
        int[] a = new int[n];;

        System.out.println("Input the the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if ((i == 0 && Math.max(a[i], a[i+1]) == a[i]) || (i == n-1 && Math.max(a[i], a[i-1]) == a[i]) || (Math.max(Math.max(a[i], a[i+1]), a[i-1]) == a[i])) {
                System.out.printf("%d ", a[i]);
            }
         }
        scanner.close();
    }
}
