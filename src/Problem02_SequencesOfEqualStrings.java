import java.util.Scanner;

public class Problem02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] strings = console.nextLine().split(" ");

        if (strings.length > 0) {
            System.out.print(strings[0] + " ");
            for (int i = 1; i < strings.length; i++) {
                if (!strings[i].equals(strings[i - 1])) {
                    System.out.println();
                }
                System.out.print(strings[i] + " ");
            }
        }
    }
}
