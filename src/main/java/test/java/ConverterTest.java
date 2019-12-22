package test.java;

import com.company.converter.Converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 6;
        int expected = 360;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        int in = 4;
        int expected = 280;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
}