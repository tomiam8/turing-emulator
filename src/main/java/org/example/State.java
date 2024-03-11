package org.example;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class State {
    static int globalIdCounter = 0;
    final int stateId;

    @Nullable
    final Alphabet toWrite;

    final int toMove;
    final boolean isHaltingState;

    int[] indexOfStatesToTransitionTo;

    /**
     *
     * @param toWrite what we should write under the tape head. null to not write anything.
     * @param toMove int - relative position to move tap to.
     * @param isHaltingState true - halt afterwards.
     * @param indexOfStatesToTransitionTo indexOfStatesToTransitionTo: [index of state to transition to for Alphabet ordinal value 0, index of state to transition to for AAlphabet ordinal value 1, ...]
     */
    public State(@Nullable Alphabet toWrite, int toMove, boolean isHaltingState, int[] indexOfStatesToTransitionTo) {
        this.stateId = globalIdCounter++;
        this.toWrite = toWrite;
        this.toMove = toMove;
        this.isHaltingState = isHaltingState;
        this.indexOfStatesToTransitionTo = indexOfStatesToTransitionTo;
    }

    @Override
    public String toString() {
        return "State{" + "stateId="
                + stateId + ", toWrite="
                + toWrite + ", toMove="
                + toMove + ", isHaltingState="
                + isHaltingState + ", indexOfStatesToTransitionTo="
                + Arrays.toString(indexOfStatesToTransitionTo) + '}';
    }
}
