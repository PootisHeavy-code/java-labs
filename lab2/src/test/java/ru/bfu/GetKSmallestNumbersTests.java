package ru.bfu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetKSmallestNumbersTests {

    @Test
    void shouldReturnKSmallestNumbers() {
        byte[] array = {8, 9, 1, 10};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {1, 8};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    void shouldReturnKSmallestNumbers2() {
        byte[] array = {};
        int k = 0;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    void shouldReturnKSmallestNumbers3() {
        byte[] array = {71, -30, -103, 29, 101, -3, 79};
        int k = 0;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    void shouldReturnKSmallestNumbers4() {
        byte[] array = {113, -97, 63, -63, 101, 14, 89, -47, 12, 92};
        int k = 5;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {-97, -63, -47, 12, 14};
        assertArrayEquals(actualResult, expectedResult);
    }
}