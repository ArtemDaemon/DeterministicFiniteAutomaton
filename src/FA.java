public class FA {
    private enum STATES {
        q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23,
        q24, q25, q26, q27, q28, q29, q30, q31
    }
    private static final STATES[] ACCEPTED_STATES = {
            STATES.q16, STATES.q17, STATES.q18, STATES.q19, STATES.q20, STATES.q21, STATES.q22, STATES.q23, STATES.q24,
            STATES.q25, STATES.q26, STATES.q27, STATES.q28, STATES.q29, STATES.q30, STATES.q31
    };
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
        transitionTable[STATES.q0.ordinal()][INPUT._0.ordinal()] = STATES.q0.ordinal();
        transitionTable[STATES.q0.ordinal()][INPUT._1.ordinal()] = STATES.q1.ordinal();
        transitionTable[STATES.q1.ordinal()][INPUT._0.ordinal()] = STATES.q2.ordinal();
        transitionTable[STATES.q1.ordinal()][INPUT._1.ordinal()] = STATES.q3.ordinal();
        transitionTable[STATES.q2.ordinal()][INPUT._0.ordinal()] = STATES.q4.ordinal();
        transitionTable[STATES.q2.ordinal()][INPUT._1.ordinal()] = STATES.q5.ordinal();
        transitionTable[STATES.q3.ordinal()][INPUT._0.ordinal()] = STATES.q6.ordinal();
        transitionTable[STATES.q3.ordinal()][INPUT._1.ordinal()] = STATES.q7.ordinal();
        transitionTable[STATES.q4.ordinal()][INPUT._0.ordinal()] = STATES.q8.ordinal();
        transitionTable[STATES.q4.ordinal()][INPUT._1.ordinal()] = STATES.q9.ordinal();
        transitionTable[STATES.q5.ordinal()][INPUT._0.ordinal()] = STATES.q10.ordinal();
        transitionTable[STATES.q5.ordinal()][INPUT._1.ordinal()] = STATES.q11.ordinal();
        transitionTable[STATES.q6.ordinal()][INPUT._0.ordinal()] = STATES.q12.ordinal();
        transitionTable[STATES.q6.ordinal()][INPUT._1.ordinal()] = STATES.q13.ordinal();
        transitionTable[STATES.q7.ordinal()][INPUT._0.ordinal()] = STATES.q14.ordinal();
        transitionTable[STATES.q7.ordinal()][INPUT._1.ordinal()] = STATES.q15.ordinal();
        transitionTable[STATES.q8.ordinal()][INPUT._0.ordinal()] = STATES.q16.ordinal();
        transitionTable[STATES.q8.ordinal()][INPUT._1.ordinal()] = STATES.q17.ordinal();
        transitionTable[STATES.q9.ordinal()][INPUT._0.ordinal()] = STATES.q18.ordinal();
        transitionTable[STATES.q9.ordinal()][INPUT._1.ordinal()] = STATES.q19.ordinal();
        transitionTable[STATES.q10.ordinal()][INPUT._0.ordinal()] = STATES.q20.ordinal();
        transitionTable[STATES.q10.ordinal()][INPUT._1.ordinal()] = STATES.q21.ordinal();
        transitionTable[STATES.q11.ordinal()][INPUT._0.ordinal()] = STATES.q22.ordinal();
        transitionTable[STATES.q11.ordinal()][INPUT._1.ordinal()] = STATES.q23.ordinal();
        transitionTable[STATES.q12.ordinal()][INPUT._0.ordinal()] = STATES.q24.ordinal();
        transitionTable[STATES.q12.ordinal()][INPUT._1.ordinal()] = STATES.q25.ordinal();
        transitionTable[STATES.q13.ordinal()][INPUT._0.ordinal()] = STATES.q26.ordinal();
        transitionTable[STATES.q13.ordinal()][INPUT._1.ordinal()] = STATES.q27.ordinal();
        transitionTable[STATES.q14.ordinal()][INPUT._0.ordinal()] = STATES.q28.ordinal();
        transitionTable[STATES.q14.ordinal()][INPUT._1.ordinal()] = STATES.q29.ordinal();
        transitionTable[STATES.q15.ordinal()][INPUT._0.ordinal()] = STATES.q30.ordinal();
        transitionTable[STATES.q15.ordinal()][INPUT._1.ordinal()] = STATES.q31.ordinal();
        transitionTable[STATES.q16.ordinal()][INPUT._0.ordinal()] = STATES.q0.ordinal();
        transitionTable[STATES.q16.ordinal()][INPUT._1.ordinal()] = STATES.q1.ordinal();
        transitionTable[STATES.q17.ordinal()][INPUT._0.ordinal()] = STATES.q2.ordinal();
        transitionTable[STATES.q17.ordinal()][INPUT._1.ordinal()] = STATES.q3.ordinal();
        transitionTable[STATES.q18.ordinal()][INPUT._0.ordinal()] = STATES.q4.ordinal();
        transitionTable[STATES.q18.ordinal()][INPUT._1.ordinal()] = STATES.q5.ordinal();
        transitionTable[STATES.q19.ordinal()][INPUT._0.ordinal()] = STATES.q6.ordinal();
        transitionTable[STATES.q19.ordinal()][INPUT._1.ordinal()] = STATES.q7.ordinal();
        transitionTable[STATES.q20.ordinal()][INPUT._0.ordinal()] = STATES.q8.ordinal();
        transitionTable[STATES.q20.ordinal()][INPUT._1.ordinal()] = STATES.q9.ordinal();
        transitionTable[STATES.q21.ordinal()][INPUT._0.ordinal()] = STATES.q10.ordinal();
        transitionTable[STATES.q21.ordinal()][INPUT._1.ordinal()] = STATES.q11.ordinal();
        transitionTable[STATES.q22.ordinal()][INPUT._0.ordinal()] = STATES.q12.ordinal();
        transitionTable[STATES.q22.ordinal()][INPUT._1.ordinal()] = STATES.q13.ordinal();
        transitionTable[STATES.q23.ordinal()][INPUT._0.ordinal()] = STATES.q14.ordinal();
        transitionTable[STATES.q23.ordinal()][INPUT._1.ordinal()] = STATES.q15.ordinal();
        transitionTable[STATES.q24.ordinal()][INPUT._0.ordinal()] = STATES.q16.ordinal();
        transitionTable[STATES.q24.ordinal()][INPUT._1.ordinal()] = STATES.q17.ordinal();
        transitionTable[STATES.q25.ordinal()][INPUT._0.ordinal()] = STATES.q18.ordinal();
        transitionTable[STATES.q25.ordinal()][INPUT._1.ordinal()] = STATES.q19.ordinal();
        transitionTable[STATES.q26.ordinal()][INPUT._0.ordinal()] = STATES.q20.ordinal();
        transitionTable[STATES.q26.ordinal()][INPUT._1.ordinal()] = STATES.q21.ordinal();
        transitionTable[STATES.q27.ordinal()][INPUT._0.ordinal()] = STATES.q22.ordinal();
        transitionTable[STATES.q27.ordinal()][INPUT._1.ordinal()] = STATES.q23.ordinal();
        transitionTable[STATES.q28.ordinal()][INPUT._0.ordinal()] = STATES.q24.ordinal();
        transitionTable[STATES.q28.ordinal()][INPUT._1.ordinal()] = STATES.q25.ordinal();
        transitionTable[STATES.q29.ordinal()][INPUT._0.ordinal()] = STATES.q26.ordinal();
        transitionTable[STATES.q29.ordinal()][INPUT._1.ordinal()] = STATES.q27.ordinal();
        transitionTable[STATES.q30.ordinal()][INPUT._0.ordinal()] = STATES.q28.ordinal();
        transitionTable[STATES.q30.ordinal()][INPUT._1.ordinal()] = STATES.q29.ordinal();
        transitionTable[STATES.q31.ordinal()][INPUT._0.ordinal()] = STATES.q30.ordinal();
        transitionTable[STATES.q31.ordinal()][INPUT._1.ordinal()] = STATES.q31.ordinal();
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
