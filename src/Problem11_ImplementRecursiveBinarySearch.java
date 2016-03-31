import java.util.Scanner;

public class Problem11_ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        String[] inputStrings = console.nextLine().split(" ");
        int[] sortedNumbers = new int[inputStrings.length];

        for (int i = 0; i < inputStrings.length; i++) {
            sortedNumbers[i] = Integer.parseInt(inputStrings[i]);
        }

        System.out.println(GetIndex(number, sortedNumbers, 0, sortedNumbers.length - 1));
    }

//   The last example in the problem is not correct !!!!!!!!!!!!!

    private static int GetIndex(int number, int[] array, int leftIndex, int rightIndex) {
        int splitIndex = leftIndex + (rightIndex - leftIndex) / 2;
        if (number == array[splitIndex]) {
            return (splitIndex);
        } else if (leftIndex == rightIndex) {
            return -1;
        } else if (number < array[splitIndex]) {
            return GetIndex(number, array, leftIndex, splitIndex);
        } else {
            return GetIndex(number, array, splitIndex + 1, rightIndex);
        }
    }
}