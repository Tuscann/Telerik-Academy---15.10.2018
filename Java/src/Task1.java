import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("");

        int counterUpDown = 0;
        int counterLeftRight = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("L")) {
                counterLeftRight -= 1;
            }
            if (input[i].equals("R")) {
                counterLeftRight += 1;
            }
            if (input[i].equals("D")) {
                counterUpDown -= 1;
            }
            if (input[i].equals("U")) {
                counterUpDown += 1;
            }
        }
        System.out.printf("(%d, %d)", counterLeftRight, counterUpDown);
    }
}
