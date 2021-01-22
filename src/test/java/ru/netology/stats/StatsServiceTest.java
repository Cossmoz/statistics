package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    StatsService service = new StatsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        long expected = 180;
        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        long expected = 15;
        long actual = service.calculateAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSaleMonth() {
        long expected = 8;
        long actual = service.calculateMaxSaleMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSaleMonth() {
        long expected = 9;
        long actual = service.calculateMinSaleMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateLessAveMonth() {
        long expected = 5;
        long actual = service.calculateLessAveMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMoreAveMonth() {
        long expected = 5;
        long actual = service.calculateMoreAveMonth(purchases);

        assertEquals(expected, actual);
    }

}