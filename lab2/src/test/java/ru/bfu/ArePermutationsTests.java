package ru.bfu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArePermutationsTests {

    @Test
    void shouldReturnTrueIfStringsArePermutations() {
        String firstString = "ab1";
        String secondString = "b1a";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
    @Test
    void shouldReturnTrueIfStringsArePermutations2() {
        String firstString = "caca2";
        String secondString = "2caca";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
    @Test
    void shouldReturnTrueIfStringsArePermutations3() {
        String firstString = "dasd32";
        String secondString = "2asdd3";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
    @Test
    void shouldReturnTrueIfStringsArePermutations4() {
        String firstString = "112233";
        String secondString = "313221";

        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
}