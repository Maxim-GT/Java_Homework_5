package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.sqr.SortNumbersService;

public class SortNumbersServiceTest {
    @CsvFileSource(files="src/test/resources/numbers.csv")

    @ParameterizedTest
    public void testPositiveNumbers(int expected, int lowerLimit, int upperLimit){
        SQRService service = new SQRService();

        int actual = service.sortNumbers(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}
