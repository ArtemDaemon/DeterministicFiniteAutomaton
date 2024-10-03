import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FA fa = new FA();

        System.out.println("Enter a binary string (only '0' and '1'):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int result = fa.isCurrentStateAccepted();
        char[] charArray = input.toCharArray();

        for (char ch : charArray) {
            result = fa.processSymbol(ch);
            if (result == FA.UNKNOWN_SYMBOL_ERR) {
                System.out.println("Error: Unknown symbol encountered.");
                break;
            }
        }

        if(result == FA.REACHED_FINAL_STATE) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }

        scanner.close();
    }
}
