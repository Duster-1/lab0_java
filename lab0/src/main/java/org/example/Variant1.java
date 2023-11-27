package org.example;

public class Variant1 {

    public enum DAY_OF_WEEK {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public int inputOutputTask(int k) {
        return 4 * k;
    }

    public int integerNumbersTask(int k) {
        return k / 100;
    }

    public boolean booleanTask(int number1) {
        return number1 > 0;
    }

    public int ifTask(int parameter) {
        return (parameter > 0) ? parameter + 1 : parameter;
    }

    public DAY_OF_WEEK switchTask(int number1) {
        return switch (number1) {
            case 1 -> DAY_OF_WEEK.MONDAY;
            case 2 -> DAY_OF_WEEK.TUESDAY;
            case 3 -> DAY_OF_WEEK.WEDNESDAY;
            default -> throw new IllegalArgumentException("Invalid day number");
        };
    }

    public double forTask(int n) {
        assert n > 0 : "Argument should be more than zero";
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result *= Math.E;
        }
        return result;
    }

    public int whileTask(int a, int b) {
        assert (a > 0 && b > 0) : "Arguments should be more than zero";
        int result = 0;
        while (a >= b) {
            a -= b;
            result++;
        }
        return result;
    }

    public double arrayTask(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public int[][] twoDimensionArrayTask(int[][] array, int k1, int k2) {
        int[] temp = array[k1];
        array[k1] = array[k2];
        array[k2] = temp;
        return array;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        Variant1 variant = new Variant1();

        int resultInputOutputTask = variant.inputOutputTask(5);
        System.out.println("Input-Output Task: " + resultInputOutputTask);

        int resultIntegerNumbersTask = variant.integerNumbersTask(300);
        System.out.println("Integer Numbers Task: " + resultIntegerNumbersTask);

        boolean resultBooleanTask = variant.booleanTask(10);
        System.out.println("Boolean Task: " + resultBooleanTask);

        int resultIfTask = variant.ifTask(-5);
        System.out.println("If Task: " + resultIfTask);

        DAY_OF_WEEK resultSwitchTask = variant.switchTask(1);
        System.out.println("Switch Task: " + resultSwitchTask);

        double resultForTask = variant.forTask(3);
        System.out.println("For Task: " + resultForTask);

        int resultWhileTask = variant.whileTask(15, 4);
        System.out.println("While Task: " + resultWhileTask);

        double[] arrayTaskInput = {1.5, 2.0, 3.5, 4.0};
        double resultArrayTask = variant.arrayTask(arrayTaskInput);
        System.out.println("Array Task: " + resultArrayTask);

        int[][] twoDimArrayInput = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultTwoDimArrayTask = variant.twoDimensionArrayTask(twoDimArrayInput, 0, 2);
        System.out.println("Two Dimensional Array Task: ");
        for (int[] row : resultTwoDimArrayTask) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Done!!!");
    }
}
