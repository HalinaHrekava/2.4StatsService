package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();


    @Test
    void calculateSum() {

        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);

        System.out.println("Сумма продаж: " + expected);
    }


    @Test
    void avg() {

        int expected = 15;
        int actual = service.avg(sales);

        assertEquals(expected, actual);

        System.out.println("Средняя сумма продаж: " + expected);
    }


    @Test
    void lastMonthWithMaxSales() {

        int expected = 8;
        int actual = service.lastMonthWithMaxSales(sales);

        assertEquals(expected, actual);
        System.out.println("Последний номер месяца с максимум продаж : " + expected);
    }


    @Test
    void findMonthWithMinSales() {
        int expected = 9;
        int actual = service.findMonthWithMinSales(sales);
        assertEquals(expected, actual);
        System.out.println("Номер месяца с минимум продаж : " + expected);
    }


    @Test
    void calculateAmountMonthSalesLessThanAvg() {
        int expected = 5;
        int actual = service.calculateAmountMonthSalesLessThanAvg(sales);
        assertEquals(expected, actual);
        System.out.println("Количество месяцев продаж ниже среднего : " + expected);
    }

    @Test
    void calculateAmountMonthSaleOverAverage() {
        int expected = 5;
        int actual = service.calculateAmountMonthSalesOverAverage(sales);
        assertEquals(expected, actual);
        System.out.println("Количество месяцев продаж выше среднего : " + expected);
    }
}