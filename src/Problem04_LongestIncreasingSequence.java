import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] strNumbers = console.nextLine().split(" ");
        int[] numbers = new int[strNumbers.length];
        List<List<Integer>> sequences = new ArrayList<List<Integer>>();

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        List<Integer> currentSequence = new ArrayList<Integer>();
        currentSequence.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentSequence.add(numbers[i]);
            } else {
                sequences.add(currentSequence);
                currentSequence = new ArrayList<>();
                currentSequence.add(numbers[i]);
            }
        }
        sequences.add(currentSequence);

        int maxLenght = 0;

        for (List<Integer> sequence : sequences) {
            for (int number : sequence) {
                System.out.print(number + " ");
            }
            maxLenght = Math.max(maxLenght, sequence.size());
            System.out.println();
        }

        for (List<Integer> sequence : sequences) {
            if (sequence.size() == maxLenght) {
                System.out.print("Longest: ");
                for (int number : sequence) {
                    System.out.print(number + " ");
                }
                break;
            }
        }
    }
}
