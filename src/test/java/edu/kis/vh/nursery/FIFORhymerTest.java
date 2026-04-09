package edu.kis.vh.nursery;

import org.junit.Test;
import org.junit.Assert;


public class FIFORhymerTest {

    @Test
    public void countOut() {
        FIFORhymer rhymer = new FIFORhymer();

        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);

        Assert.assertEquals(1, rhymer.countOut());
        Assert.assertEquals(2, rhymer.countOut());
        Assert.assertEquals(3, rhymer.countOut());
    }
}