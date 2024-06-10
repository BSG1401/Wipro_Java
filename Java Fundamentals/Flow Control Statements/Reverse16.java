public class Reverse16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            int reversedNumber = reverseNumber(number);
            System.out.println("Reversed Number: " + reversedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number");
        }
    }
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}

