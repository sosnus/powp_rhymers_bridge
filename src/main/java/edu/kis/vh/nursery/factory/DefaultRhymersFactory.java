package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.defaultCountingOutRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    @Override
    public defaultCountingOutRhymer GetStandardRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFIFORhymer() {
        return new FifoRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
