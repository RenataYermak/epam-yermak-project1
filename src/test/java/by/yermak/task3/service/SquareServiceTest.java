package by.yermak.task3.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareServiceTest {
    @Test
    public void innerSquareArea_shouldReturnCorrectSquareArea() {
        double radius = 2.5;
        double expected = 12.5;
        double actual = SquareService.innerSquareArea(radius);
        assertEquals(expected,actual);
    }
    @Test
    public void sideOfSquare_shouldReturnCorrectSideOfSquare() {
        double area = 4.0;
        double expected = 2.0;
        double actual = SquareService.sideOfSquare(area);
        assertEquals(expected,actual);
    }
    @Test
    public void differenceArea_shouldReturnCorrectDifferenceArea() {
        double innerArea = 3.2;
        double outerArea =4.2;
        double expected = 1.3125;
        double actual = SquareService.differenceArea(innerArea,outerArea);
        assertEquals(expected,actual);
    }
}
