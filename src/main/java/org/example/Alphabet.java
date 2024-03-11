package org.example;

public enum Alphabet {
    A(0, 'A'),
    B(1, 'B');

    public final int ordinal;
    public final char printChar;
    public static final Alphabet BLANK = A;

    Alphabet(int ordinal, char printChar) {
        this.ordinal = ordinal;
        this.printChar = printChar;
    }
}
