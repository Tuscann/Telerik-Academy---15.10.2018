import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String az = scan.nextLine();

        String regex = "^[a-z]{1,}[A-Z]{1,}$";
        String regex2 = "[a-z]+";
        String regex3 = "[A-Z]+";
        String regex4 = "[A-Z][a-z]+";

        boolean matches1 = Pattern.matches(regex, az);
        boolean matches2 = Pattern.matches(regex2, az);
        boolean matches3 = Pattern.matches(regex3, az);
        boolean matches4 = Pattern.matches(regex4, az);

        if (matches1) {
            System.out.println("elephant"); // elePHANT
        } else if (matches2) {
            System.out.println("field");   // kamendasd only small letters
        } else if (matches3) {
            System.out.println("constant");  //ASDFG  only big letters
        } else if (matches4) {
            System.out.println("pascal");   //Kamennn    First big letter after only small letters
        } else {
            System.out.println("mismatch");   // SNAke
        }
    }
}
