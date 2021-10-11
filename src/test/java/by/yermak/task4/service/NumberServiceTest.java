package by.yermak.task4.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberServiceTest {
    @Test
    public void thereAreTwoEvenNumbers_allEvenNumber_shouldReturnTrue() {
        int[] values = {2, 4, 6, 8};
        assertTrue(NumberService.thereAreTwoEvenNumbers(values));
    }
    @Test
    public void thereAreTwoEvenNumbers_allOddNumber_shouldReturnFalse() {
        int[] values = {3, 5, 7, 9};
        assertFalse(NumberService.thereAreTwoEvenNumbers(values));
    }
    @Test
    public void thereAreTwoEvenNumbers_twoEvenNumber_shouldReturnTrue() {
        int[] values = {2, 4, 5, 7};
        assertTrue(NumberService.thereAreTwoEvenNumbers(values));
    }
    @Test
    public void thereAreTwoEvenNumbers_oneEvenNumber_shouldReturnFalse() {
        int[] values = {2, 5, 7, 9};
        assertFalse(NumberService.thereAreTwoEvenNumbers(values));
    }
    @Test
    public void isPerfectNumber_shouldReturnTrue(){
        int number = 6;
        assertTrue(NumberService.isPerfectNumber(number));
    }
    @Test
    public void isPerfectNumber_shouldReturnFalse(){
        int number = 5;
        assertFalse(NumberService.isPerfectNumber(number));
    }
}
