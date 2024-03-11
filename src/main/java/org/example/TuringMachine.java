package org.example;

import java.util.List;

public class TuringMachine {
    private final List<State> machineStates;
    private final List<Alphabet> tape;
    private int headPosition;
    private State currentState;

    /**
     *
     * @param machineStates List of states. States[0] is the initial State!
     * @param tape the initial tape!
     */
    public TuringMachine(List<State> machineStates, List<Alphabet> tape) {
        this.machineStates = machineStates;
        this.tape = tape;
        this.headPosition = 0;
        this.currentState = machineStates.getFirst();
    }

    public void run() {
        while (!currentState.isHaltingState) {
            if (currentState.toWrite != null) {
                tape.set(headPosition, currentState.toWrite);
            }
            headPosition += currentState.toMove;
            currentState = machineStates.get(currentState.indexOfStatesToTransitionTo[tape.get(headPosition).ordinal]);
            printMachine();
        }
        System.out.println("Halted! In state: " + this.currentState);
    }

    public void printMachine() {
        System.out.print("Current state: " + currentState + " headPosition: " + headPosition + "  tape: ");
        for (Alphabet tapePoint : tape) {
            System.out.print(tapePoint.printChar);
        }
        System.out.println();
    }
}
