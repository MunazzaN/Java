package ExceptionHandling;

public class exception {
    public static int convertStringToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a valid integer: " + input, e);
        }
    }
}


