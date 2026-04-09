package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int MAX_SIZE = 11;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAULT_VALUE = -1;
    // TODO: zastąpić sztywną tablicę dynamiczną strukturą danych, aby uniknąć limitu pojemności
    private final int[] capacity = new int[INT];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            capacity[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return capacity[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return capacity[total--];
    }

}
