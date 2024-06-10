public class Prime12 {
    public static void main(String [] args){
        int a=Integer.parseInt(args[0]);
        for(int i=2;i<=a/2;i++){
            if (a%i==0){
                System.out.println("Not Prime");
                break;
            }
            else{
                System.out.println("Prime");
                break;
            }
        }
    }
}
