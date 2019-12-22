package Point;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Assert.assertEquals(2, Point.distance(0, 0, 2, 0), 0.01);
        Assert.assertEquals(2, Point.distance(2, 2, 4, 2), 0.01);
    }
}
