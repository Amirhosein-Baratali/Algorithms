package com.example.algorithms.best_time_to_buy_and_sell_stock_II

class BestTimeToBuyAndSellStockII {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var maxProfit = 0
        var buy = prices[0]
        prices.forEach { price ->
            if (buy == price) {
                return@forEach
            } else if (buy > price) {
                buy = price
            } else {
                maxProfit += price - buy
                buy = price
            }
        }
        return maxProfit
    }

    //chatgpt way
/*
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0

        var profit = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1]
            }
        }
        return profit
    }
*/
}