package com.pantxi.fizzbuzz.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {
    RomanNumerals ArabicRomanNumerals = new RomanNumerals();

    @Test
    public void Convert1() {
        String resultat1 = ArabicRomanNumerals.convert(1);
        assertEquals("I", resultat1);
    }

    @Test
    public void Convert2() {
        String resultat2 = ArabicRomanNumerals.convert(2);
        assertEquals("II", resultat2);
    }

    @Test
    public void Convert3() {
        String resultat3 = ArabicRomanNumerals.convert(3);
        assertEquals("III", resultat3);
    }

    @Test
    public void Convert10() {
        String resultat10 = ArabicRomanNumerals.convert(10);
        assertEquals("X", resultat10);
    }

    @Test
    public void Convert20() {
        String resultat20 = ArabicRomanNumerals.convert(20);
        assertEquals("XX", resultat20);
    }

    @Test
    public void Convert30() {
        String resultat30 = ArabicRomanNumerals.convert(30);
        assertEquals("XXX", resultat30);
    }

    @Test
    public void Convert40() {
        String resultat40 = ArabicRomanNumerals.convert(40);
        assertEquals("XL", resultat40);
    }

    @Test
    public void Convert50() {
        String resultat50 = ArabicRomanNumerals.convert(50);
        assertEquals("L", resultat50);
    }

    @Test
    public void Convert4() {
        String resultat4 = ArabicRomanNumerals.convert(4);
        assertEquals("IV", resultat4);
    }

    @Test
    public void Convert5() {
        String resultat5 = ArabicRomanNumerals.convert(5);
        assertEquals("V", resultat5);
    }

    @Test
    public void Convert9() {
        String resultat9 = ArabicRomanNumerals.convert(9);
        assertEquals("IX", resultat9);
    }

    @Test
    public void Convert11() {
        String resultat11 = ArabicRomanNumerals.convert(11);
        assertEquals("XI", resultat11);
    }
}









