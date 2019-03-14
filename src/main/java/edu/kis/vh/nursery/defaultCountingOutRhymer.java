package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public int total = -1;
    private int[] NUMBERS = new int[12];
    private final int stackMaxSize = 11;
    private final int stackEmpty = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == stackEmpty;
    }

    public boolean isFull() {
        return total == stackMaxSize;
    }

    protected int peekaboo() {
        if (callCheck())
            return stackEmpty;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return stackEmpty;
        return NUMBERS[total--];
    }

}
