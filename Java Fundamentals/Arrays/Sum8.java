/*
 * Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
0/P: 22
[i.e 10+3+9]
Eg2) Array Elements
O/P: 19
Eg3) Array Elements
O/P:10
-
7,1,2,3,6
-
1,6,4,7,9
 */
import java.util.Scanner;

public class Sum8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Reading the size of the array
        int n = input.nextInt();
        int arr[] = new int[n];
        
        // Reading the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += arr[i];
            }

            if (arr[i] == 7) {
                ignore = false;
            }
        }
        
        System.out.println(sum);
    }
}
