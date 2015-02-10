package com.diosoft.training;

import java.util.Arrays;

public class MainArrays {

    public static void main(String[] args) {
        testPositive();
        testLeftArrayIsEmpty();
        testLeftArrayIsNull();

    }

    private static void testPositive() {
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArrays = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};

        System.out.println("LeftArray: " + Arrays.toString(leftArray));
        System.out.println("RightArray: " + Arrays.toString(rightArray));

        MainArrays main = new MainArrays();
        int[] returnValue = main.leftUnion(leftArray, rightArray);

        System.out.println("ReturnValue: " + Arrays.toString(returnValue));
        System.out.println("ExpectedArrays: " + Arrays.toString(expectedArrays));
    }

    private static void testLeftArrayIsEmpty() {
        int[] leftArray = {};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArrays = {};

        System.out.println("LeftArray: " + Arrays.toString(leftArray));
        System.out.println("RightArray: " + Arrays.toString(rightArray));

        MainArrays main = new MainArrays();
        int[] returnValue = main.leftUnion(leftArray, rightArray);

        System.out.println("ReturnValue: " + Arrays.toString(returnValue));
        System.out.println("ExpectedArrays: " + Arrays.toString(expectedArrays));
    }

    private static void testLeftArrayIsNull() {
        int[] leftArray = null;
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedArrays = {};

        System.out.println("LeftArray: " + Arrays.toString(leftArray));
        System.out.println("RightArray: " + Arrays.toString(rightArray));

        MainArrays main = new MainArrays();
        int[] returnValue = main.leftUnion(leftArray, rightArray);

        System.out.println("ReturnValue: " + Arrays.toString(returnValue));
        System.out.println("ExpectedArrays: " + Arrays.toString(expectedArrays));
    }

    public int[] leftUnion(int[] leftArray, int[] rightArray) {

        int[] buffArray = Arrays.copyOf(leftArray, leftArray.length + rightArray.length);

        System.out.println("BuffArray: " + Arrays.toString(buffArray));
        int countOfFoundedElementsInRightArray = 0;

        for (int rightArrayElement : rightArray) {
            for (int leftArrayElement : leftArray) {
                if (rightArrayElement == leftArrayElement) {
                    buffArray[leftArray.length + countOfFoundedElementsInRightArray] = rightArrayElement;
                    countOfFoundedElementsInRightArray++;
                }
            }
        }
        System.out.println("Count of founded elements = " + countOfFoundedElementsInRightArray);

        System.out.println("BuffArray after search: " + Arrays.toString(buffArray));

        int[] resultArray = Arrays.copyOf(buffArray, leftArray.length + countOfFoundedElementsInRightArray);

        return resultArray;
    }
}
