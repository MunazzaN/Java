package Additional;

public class StringRotation {

    public static boolean isRotation(String str1, String str2) {
        // Check if lengths of strings are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of concatenated string
        return concatenated.contains(str2);
    }
}

