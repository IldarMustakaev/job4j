import com.company.SqArea;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void distance() {
        Assert.assertEquals(1, SqArea.square(4, 1), 0.01);
        Assert.assertEquals(2, SqArea.square(6, 2), 0.01);
    }
}
