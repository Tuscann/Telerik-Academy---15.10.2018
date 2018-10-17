import java.util.Scanner;

public class Task3_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();

        if (isConstant(input)) {
            System.out.println("constant");
        } else if (isField(input)) {
            System.out.println("field");
        } else if (isPascal(input)) {
            System.out.println("pascal");
        } else if (isElephant(input)) {
            System.out.println("elephant");
        } else {
            System.out.println("mismatch");
        }
    }

    private static boolean isConstant(char[] word) {

        for (char currentChar : word) {
            if (currentChar < 'A' || currentChar > 'Z') {
                return false;
            }
        }
        return true;
    }

    private static boolean isField(char[] word) {
        for (char currentChar : word) {
            if (currentChar < 'a' || currentChar > 'z') {
                return false;
            }
        }
        return true;
    }

    private static boolean isPascal(char[] word) {
        if (word[0] < 'A' || word[0] > 'Z') {
            return false;
        }
        for (int i = 1; i < word.length; i++) {
            if (word[i] < 'a' || word[i] > 'z') {
                return false;
            }
        }
        return true;
    }

    private static boolean isElephant(char[] word) {
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            index = i;
            if (word[i] < 'a' || word[i] > 'z') {
                break;
            }
        }
        if (word.length == 1) {
            return false;
        }
        for (int j = index; j < word.length; j++) {
            if (word[j] < 'A' || word[j] > 'Z') {
                return false;
            }
        }
        return true;
    }
}
