package by.yermak.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilTest {
    @Test
    public void absInt_shouldReturnCorrectAbsForInt() {
        assertEquals(NumberUtil.absInt(-2), 2);
    }

    @Test
    public void absDouble_shouldReturnCorrectAbsForDouble() {
        assertEquals(NumberUtil.absDouble(-2.0), 2.0);
    }
}
