package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double rsl = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, rsl, 0.01);
    }

     @Test
    public void when00to22then3() {
         Point a = new Point(0, 0);
         Point b = new Point(2, 2);
         double rsl = a.distance(b);
         double expected = 2.8;
         Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when00to22then4() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double rsl = a.distance(b);
        double expected = 4;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}