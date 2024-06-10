public class Floyd15 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number");
            return;
        }

        try {
            int rows = Integer.parseInt(args[0]);
            int number = 1;
            System.out.println("Floyd's Triangle:");
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number");
        }
    }
}

