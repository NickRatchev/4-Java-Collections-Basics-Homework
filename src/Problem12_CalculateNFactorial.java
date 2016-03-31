import java.math.BigInteger;
import java.util.Scanner;

public class Problem12_CalculateNFactorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println(GetFactorial(BigInteger.valueOf(number)));
    }

    public static BigInteger GetFactorial(BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return (number.multiply(GetFactorial(number.subtract(BigInteger.ONE))));
        }
    }
}

//    Направил съм го с BigInteger за да може да смята с по-големи числа.