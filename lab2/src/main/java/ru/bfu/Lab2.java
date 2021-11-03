package ru.bfu;

import java.util.Arrays;

public class Lab2 {

    /**
     * Метод getKSmallestNumbers возвращает k наименьших элементов в массиве array, отсортированных в порядке возрастания
     *
     * @param array неотсортированный массив типа byte произвольной длины n
     * @param k     целочисленный параметр, 0 <= k <= n
     * @return отсортированный массив из k наименьших элементов
     * <p>
     * ПРИМЕР:
     * Вход: array = [8, 9, 1, 10], k = 2
     * Выход: [1, 8]
     */
    static byte[] getKSmallestNumbers(byte[] array, int k) {
        Arrays.sort(array);
        if (array.length == 0)
            return new byte[0];
        return Arrays.copyOfRange(array, 0, k);
    }

    /**
     * Метод arePermutations проверяет, является ли первая строка перестановкой второй, то есть может ли первая строка
     * быть получена из второй путем перестановки символов.
     *
     * @param firstString  первая строка произвольной длины, состоящая из цифр 0...9
     *                     и строчных букв латинского алфавита a...z
     * @param secondString вторая строка произвольной длины
     * @return true, если первая строка является перестановкой второй
     * false, в противном случае
     * <p>
     * ПРИМЕР 1:
     * Вход: firstString = "ab1", secondString = "b1a"
     * Выход: true
     * <p>
     * ПРИМЕР 2:
     * Вход: firstString = "ab", secondString = "aa"
     * Выход: false
     */
    static boolean arePermutations(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        int[] letters = new int[256];

        char[] s_array = firstString.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < secondString.length(); i++) {
            int c = (int) secondString.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Метод rotateMatrix совершает поворот элементов квадратной матрицы на 90 градусов по часовой стрелке
     *
     * @param matrix целочисленная квадратная матрица
     * @return целочисленная квадратная матрица, полученная путем поворота исходной матрицы на 90 градусов
     * по часовой стрелке
     * <p>
     * ПРИМЕР:
     * Вход: matrix = [1, 2, 3
     * 4, 5, 6
     * 7, 8, 9]
     * Выход: [7, 4, 1
     * 8, 5, 2
     * 9, 6, 3]
     */
    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        for (int i = 0; i < newMatrix.length; i++ ){

            for (int j = 0; j < newMatrix.length; j++){

                newMatrix[i][j] = matrix[n - j - 1][i];
            }
        }

        return newMatrix;
    }
}
