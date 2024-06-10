public class Alpha4 {
    public static void main(String[] args) {
        char one=args[0].charAt(0);
        char two=args[1].charAt(0);
        int a=one-97;
        int b=two-97;
        if (b>a){
            System.out.println(one+","+two);
        }
        else{
            System.out.println(two+","+one);
        }
    }
}
