public class Mal6 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        String s=args[1];
        String x="Male";
        String y="Female";
        if(s.equals(y) && (1<=a && a<=58)){
            System.out.println("Percentage of Interest is 8.2%");
        }
        else if(s.equals(y) && (59<=a && a<=100)){
            System.out.println("Percentage of Interest is 9.2%");
        }
        else if(s.equals(x) && (1<=a && a<=58)){
            System.out.println("Percentage of Interest is 8.4%");
        }
        else if(s.equals(x) && (59<=a && a<=100)){
            System.out.println("Percentage of Interest is 10.5%");
        }

    }
}
