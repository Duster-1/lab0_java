package org.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.example.Variant1;
import org.example.Variant1.DAY_OF_WEEK;

class TestVariant1 {

    public static double EPS = 0.0000001;

    @Test(dataProvider = "inputOutputTaskProvider")
    public void inputOutputTaskTest(int k, int expected) {
        assertEquals(new Variant1().inputOutputTask(k), expected);
    }

    @DataProvider
    public Object[][] inputOutputTaskProvider() {
        return new Object[][] { { 2, 8 }, { 4, 16 }, { 0, 0 } };
    }

    @Test(dataProvider = "integerNumbersTaskProvider")
    public void integerNumbersTaskTest(int k, int expected) {
        assertEquals(new Variant1().integerNumbersTask(k), expected);
    }

    @DataProvider
    public Object[][] integerNumbersTaskProvider() {
        return new Object[][] { { 100, 1 }, { 200, 2 }, { 150, 1 } };
    }

    @Test(dataProvider = "booleanTaskProvider")
    public void booleanTaskTest(int number, boolean expected) {
        assertEquals(new Variant1().booleanTask(number), expected);
    }

    @DataProvider
    public Object[][] booleanTaskProvider() {
        return new Object[][] { { 5, true }, { 0, false }, { -3, false } };
    }

    @Test(dataProvider = "ifTaskProvider")
    public void ifTaskTest(int parameter, int expected) {
        assertEquals(new Variant1().ifTask(parameter), expected);
    }

    @DataProvider
    public Object[][] ifTaskProvider() {
        return new Object[][] { { 2, 3 }, { 0, 0 }, { -3, -3 } };
    }

    @Test(dataProvider = "switchTaskProvider")
    public void switchTaskTest(int number, DAY_OF_WEEK expected) {
        assertEquals(new Variant1().switchTask(number), expected);
    }

    @DataProvider
    public Object[][] switchTaskProvider() {
        return new Object[][] { { 1, DAY_OF_WEEK.MONDAY }, { 2, DAY_OF_WEEK.TUESDAY }, { 3, DAY_OF_WEEK.WEDNESDAY } };
    }

    @Test(dataProvider = "forTaskProvider")
    public void forTaskTest(int n, double expected) {
        assertEquals(new Variant1().forTask(n), expected, EPS);
    }

    @DataProvider
    public Object[][] forTaskProvider() {
        return new Object[][] { { 3, 2.666667 }, { 7, 2.718254 }, { 12, 2.718282 } };
    }

    @Test(dataProvider = "whileTaskProvider")
    public void whileTaskTest(int a, int b, int expected) {
        assertEquals(new Variant1().whileTask(a, b), expected);
    }

    @DataProvider
    public Object[][] whileTaskProvider() {
        return new Object[][] { { 10, 2, 0 }, { 12, 10, 2 }, { 12, 1, 0 }, { 25, 7, 4 } };
    }

    @Test(dataProvider = "arrayTaskProvider")
    public void arrayTaskTest(double[] array, double expected) {
        assertEquals(new Variant1().arrayTask(array), expected);
    }

    @DataProvider
    public Object[][] arrayTaskProvider() {
        return new Object[][] { { new double[] { 10, 2, 3 }, 5.0 }, { new double[] { 10, 2, 13 }, 8.333333 },
                { new double[] { 4, 3, 5, -4, 9, 2 }, 3.166667 } };
    }

    @Test(dataProvider = "twoDimensionArrayTaskProvider")
    public void twoDimensionArrayTaskTest(int[][] input, int k1, int k2, int[][] expected) {
        assertEquals(new Variant1().twoDimensionArrayTask(input, k1, k2), expected);
    }

    @DataProvider
    public Object[][] twoDimensionArrayTaskProvider() {
        int[][] input = { { 2, 3, 6, 9, -9 }, { 34, 98, -9, 2, 1 }, { -4, 2, 1, 6, 1 }, { -98, 8, 1, 5, 3 } };

        int[][] input23 = { { 2, 3, 6, 9, -9 }, { -4, 2, 1, 6, 1 }, { 34, 98, -9, 2, 1 }, { -98, 8, 1, 5, 3 } };

        int[][] input14 = { { -98, 8, 1, 5, 3 }, { -4, 2, 1, 6, 1 }, { 34, 98, -9, 2, 1 }, { 2, 3, 6, 9, -9 } };

        return new Object[][] { { input, 2, 3, input23 }, { input, 1, 4, input14 } };
    }
}
