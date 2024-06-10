/*write a program to initialize an integer array and print the sum and average of the array
 *
 */

import java.util.*;
public class Sumavg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int sum=0;
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double average = (double) sum / a;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
