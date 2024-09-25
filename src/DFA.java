public class DFA {
    private static final int FINAL_STATE = 5;

    public static final int UNKNOWN_SYMBOL_ERR = -1;

    private int currentState;

    private static final int[][] TRANSITION_TABLE = {
            {1, 1}, // q0
            {2, 2}, // q1
            {3, 3}, // q2
            {4, 4}, // q3
            {6, 5}, // q4
            {5, 5}, // q5
            {6, 6}  // q6
    };

    public DFA() {
        this.currentState = 0;
    }

    public int processSymbol(char symbol) {
        int input;
        if(symbol == '0') input = 0;
        else if (symbol == '1') input = 1;
        else return UNKNOWN_SYMBOL_ERR;

        currentState = TRANSITION_TABLE[currentState][input];
        return currentState;
    }

    public boolean isInAcceptedState() {
        return currentState == FINAL_STATE;
    }
}
