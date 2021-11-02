package ru.bfu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateMatrixTests {

    @Test
    void shouldRotateMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    void shouldRotateMatrix2() {
        int[][] matrix = {{0}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{0}};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    void shouldRotateMatrix3() {
        int[][] matrix = {{1, 2, 3}, {2, 3, 3}, {5, 4, 3}};

        int[][] actualResult = Lab2.rotateMatrix(matrix);

        int[][] expectedResult = {{5, 2, 1}, {4, 3, 2}, {3, 3, 3}};
        assertArrayEquals(actualResult, expectedResult);
    }
}