import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DFA dfa = new DFA();

        System.out.println("Enter a binary string (only '0' and '1'):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean validInput = true;

        for (char ch : input.toCharArray()) {
            int result = dfa.processSymbol(ch);
            if (result == DFA.UNKNOWN_SYMBOL_ERR) {
                System.out.println("Error: Unknown symbol encountered.");
                validInput = false;
                break;
            }
        }

        if (validInput && dfa.isInAcceptedState()) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }

        scanner.close();
    }
}
