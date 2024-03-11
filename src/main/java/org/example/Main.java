package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int INITIAL_TAPE_SIZE = 10;

    public static void main(String[] args) {
        List<State> states = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            states.add(new State(Alphabet.B, 1, false, new int[]{i+1, i+1}));
        }
        states.add(new State(Alphabet.B, 1, true, new int[]{5, 5}));

        List<Alphabet> tape = new ArrayList<>();
        for (int i = 0; i < INITIAL_TAPE_SIZE; i++) {
            tape.add(Alphabet.BLANK);
        }

        TuringMachine turing = new TuringMachine(states, tape);
        turing.run();
    }
}