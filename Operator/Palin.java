public class Palin {
    public static void main(String[] args) {


        int number = 12345;

        // Reverse the number
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
