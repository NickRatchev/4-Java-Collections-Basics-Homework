import java.util.ArrayList;
import java.util.Scanner;

public class Problem07_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputStr1 = console.nextLine().replace(" ", "");
        String inputStr2 = console.nextLine().replace(" ", "");
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> outputList = new ArrayList<>();

        for (char currentChar : inputStr1.toCharArray()) {
            list1.add(currentChar);
        }
        for (char currentChar : inputStr2.toCharArray()) {
            list2.add(currentChar);
        }

        outputList.addAll(list1);
        for (char currentChar : list2) {
            if (!outputList.contains(currentChar)) {
                outputList.add(currentChar);
            }
        }
        for (char currentChar : outputList) {
            System.out.print(currentChar + " ");
        }
    }
}
