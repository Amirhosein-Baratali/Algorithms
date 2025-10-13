package com.example.algorithms.best_time_to_buy_and_sell_stock

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        val size = prices.size
        if (size < 2) return 0
        var maxProfit = 0
        var buy = prices[0]
        for (day in 1 until size) {
            if (buy > prices[day]) {
                buy = prices[day]
            } else if (maxProfit < prices[day] - buy) {
                maxProfit = prices[day] - buy
            }
        }
        return maxProfit
    }
}