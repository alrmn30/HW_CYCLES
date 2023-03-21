package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calculate.csv")
    public void calculate(int income, int expanse, int threshold, int expected) {
        CalcRestService service = new CalcRestService();
        int actual = service.calculate(income, expanse, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
