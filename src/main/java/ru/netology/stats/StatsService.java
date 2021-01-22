package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        long average = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
            average = sum/12;
        }
        return average;
    }
    public long calculateMaxSaleMonth(long[] purchases) {
        long maxSale = purchases[0];
        for (long purchase : purchases) {
            if (maxSale < purchase) {
                maxSale = purchase;
            }
        }

        long maxSaleMonth = 0 ;
        long  month = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (purchase == maxSale) {
                maxSaleMonth = month;
            }
        }

        return maxSaleMonth;
    }
    public long calculateMinSaleMonth(long[] purchases) {
        long minSale = purchases[0];
        for (long purchase : purchases) {
            if (minSale > purchase) {
                minSale = purchase;
            }
        }

        long minSaleMonth = 0 ;
        long  month = 0;
        for (long purchase : purchases) {
            month = month + 1;
            if (purchase == minSale) {
                minSaleMonth = month;
            }
        }

        return minSaleMonth;
    }

    public long calculateLessAveMonth(long[] purchases) {
        long average = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
            average = sum/12;
        }
        long lessAveMonth = 0;
        for (long purchase : purchases){
            if (purchase > average) {
                lessAveMonth += 1;
            }
        }
        return lessAveMonth;
    }

    public long calculateMoreAveMonth(long[] purchases) {
        long average = 0;
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
            average = sum/12;
        }
        long moreAveMonth = 0;
        for (long purchase : purchases){
            if (purchase > average) {
                moreAveMonth += 1;
            }
        }
        return moreAveMonth;
    }



}