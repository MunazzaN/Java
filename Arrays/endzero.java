import java.util.Arrays;
public class endzero {
    public static void main(String[] args) {
        int[] num = {0, 2, 0, 1, 0, 3, 12};

        System.out.println("Original array: " + Arrays.toString(num));

        int m = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[m++] = num[i];
            }
        }

        for (int i = m; i < num.length; i++) {
            num[i] = 0;
        }

        System.out.println("Array after moving zeros to end " + Arrays.toString(num));
    }
}

