package ru.netology.stats;

public class StatsService {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avg(int[] sales) {
        int sum = calculateSum(sales);
        return sum / sales.length;
    }

    public int lastMonthWithMaxSales(int[] sales) {
        int max = getMax(sales);

        int monthCount = 0;
        int resultMonth = 0;
        for (int sale : sales) {
            monthCount++;
            if (sale == max) {
                resultMonth = monthCount;
            }
        }
        return resultMonth;
    }

    private int getMax(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int findMonthWithMinSales(int[] sales) {
        int min = getMin(sales);

        int monthCount = 0;
        int resultMonth = 0;
        for (int sale : sales) {
            monthCount++;
            if (sale == min) {
                resultMonth = monthCount;
            }
        }
        return resultMonth;
    }

    private int getMin(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int calculateAmountMonthSalesLessThanAvg(int[] sales) {

        int avg = avg(sales);
        int amountMonth = 0;
        for (int sale : sales) {
            if (avg < sale) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }

    public int calculateAmountMonthSalesOverAverage(int[] sales) {

        int avg = avg(sales);
        int amountMonth = 0;
        for (int sale : sales) {
            if (avg > sale) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}