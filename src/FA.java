public class FA {
    private enum STATES {q0, q1, q2, q3, q4, q5, q6}
    private static final STATES[] ACCEPTED_STATES = {STATES.q5};
    private enum INPUT {_0, _1}
    private static final char[] ALPHABET = {'0', '1'};

    private static final int TOTAL_STATES = STATES.values().length;
    private static final int ALPHABET_CHARACTERS = ALPHABET.length;
    private static final int[][] transitionTable = new int[TOTAL_STATES][ALPHABET_CHARACTERS];

    public static final int UNKNOWN_SYMBOL_ERR = -1;
    public static final int NOT_REACHED_FINAL_STATE = 0;
    public static final int REACHED_FINAL_STATE = 1;

    private int currentState;

    public FA() {
        this.currentState = STATES.q0.ordinal();
        setTransitionsTable();
    }

    private static void setTransitionsTable() {
        transitionTable[STATES.q0.ordinal()][INPUT._0.ordinal()] = STATES.q1.ordinal();
        transitionTable[STATES.q0.ordinal()][INPUT._1.ordinal()] = STATES.q1.ordinal();
        transitionTable[STATES.q1.ordinal()][INPUT._0.ordinal()] = STATES.q2.ordinal();
        transitionTable[STATES.q1.ordinal()][INPUT._1.ordinal()] = STATES.q2.ordinal();
        transitionTable[STATES.q2.ordinal()][INPUT._0.ordinal()] = STATES.q3.ordinal();
        transitionTable[STATES.q2.ordinal()][INPUT._1.ordinal()] = STATES.q3.ordinal();
        transitionTable[STATES.q3.ordinal()][INPUT._0.ordinal()] = STATES.q4.ordinal();
        transitionTable[STATES.q3.ordinal()][INPUT._1.ordinal()] = STATES.q4.ordinal();
        transitionTable[STATES.q4.ordinal()][INPUT._0.ordinal()] = STATES.q6.ordinal();
        transitionTable[STATES.q4.ordinal()][INPUT._1.ordinal()] = STATES.q5.ordinal();
        transitionTable[STATES.q5.ordinal()][INPUT._0.ordinal()] = STATES.q5.ordinal();
        transitionTable[STATES.q5.ordinal()][INPUT._1.ordinal()] = STATES.q5.ordinal();
        transitionTable[STATES.q6.ordinal()][INPUT._0.ordinal()] = STATES.q6.ordinal();
        transitionTable[STATES.q6.ordinal()][INPUT._1.ordinal()] = STATES.q6.ordinal();
    }

    public int processSymbol(char current_symbol) {
        int charPosition;
        for (charPosition = 0; charPosition < ALPHABET_CHARACTERS; charPosition++) {
            if (current_symbol == ALPHABET[charPosition]) break;
        }
        if(charPosition == ALPHABET_CHARACTERS) return UNKNOWN_SYMBOL_ERR;

        this.currentState = transitionTable[this.currentState][charPosition];
        return isCurrentStateAccepted();
    }

    public int isCurrentStateAccepted() {
        for (STATES acceptedState : ACCEPTED_STATES) {
            if (this.currentState == acceptedState.ordinal())
                return REACHED_FINAL_STATE;
        }
        return NOT_REACHED_FINAL_STATE;
    }
}
