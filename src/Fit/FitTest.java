package Fit;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        Assert.assertEquals(92, Fit.manWeight(180), 0.01);
    }

    @Test
    public void womanWeight() {
        Assert.assertEquals(69, Fit.womanWeight(170), 0.01);
    }
}
