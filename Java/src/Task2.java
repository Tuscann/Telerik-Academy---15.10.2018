import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bestSum = 0;
        String x = "";

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {

            String currentString = scan.nextLine();
            String str = currentString.toUpperCase();

            int currentSum = 0;
            for (char ch : str.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    currentSum += 1 + ch - 'A';
                }
            }
            if (currentSum > bestSum) {
                bestSum = currentSum;
                x = currentString;
            }
        }
        System.out.println(bestSum + " " + x);
    }
}
