package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0; //*

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) //*
            totalRejected++;
        else
            super.countIn(in); //*
    }
}
// ctrl+alt+L - code formatting
// 3.1.2 //poprawiono formatowanie pozostałych plików przy pomocy skrótu powyżej
