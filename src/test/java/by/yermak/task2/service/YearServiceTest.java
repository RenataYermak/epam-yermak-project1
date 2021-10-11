package by.yermak.task2.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearServiceTest {
    @Test
    public void isLeapYear_shouldReturnTrue() {
        int year = 2000;
        assertTrue(YearService.isLeapYear(year));
    }

    @Test
    public void isLeapYear_shouldReturnFalse() {
        int year = 2001;
        assertFalse(YearService.isLeapYear(year));
    }

    @Test
    public void amountDayInMonth_shouldReturnCorrectDayInMonth() {
        int year = 2001;
        int monthNumber = 5;
        int expected = 31;
        int actual = YearService.amountDayInMonth(year, monthNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void amountDayInMonth_shouldReturnCorrectDayInMonthOfLeapYear() {
        int year = 2000;
        int monthNumber = 2;
        int expected = 29;
        int actual = YearService.amountDayInMonth(year, monthNumber);
        assertEquals(expected, actual);
    }
}
