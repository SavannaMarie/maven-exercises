import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        if(StringUtils.isNumeric(userInput)) {
            System.out.println("User has entered a number");
        } else {
            System.out.println("User has entered a string");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

    }
}
