package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 13, 11, 12};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findAnotherMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {8, 3, 1, 4, 3, 15, 7, 79, 99, 11, 12};
        long expected = 99;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}