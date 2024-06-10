import java.util.*;
public class Sum_of_digits14{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while (a!=0){
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println(sum);
    }
}