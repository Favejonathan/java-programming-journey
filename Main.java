
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger firstNumber = BigInteger.ZERO;
        BigInteger secondNumber = BigInteger.ONE;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= 100; i++) {

            System.out.print(firstNumber + " ");

            BigInteger nextNumber = firstNumber.add(secondNumber);

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
