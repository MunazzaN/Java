package Additional;

public class Swap {
    public static void swapTwoNumberwithoutExtraVariable(int number1, int number2){

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("After swapping Number1 is :"+number1);
        System.out.println("After swapping Number2 is :"+number2);

    }
}
