package com.example.algorithms.best_time_to_buy_and_sell_stock

import kotlin.test.Test

class BestTimeToBuyAndSellStockTest {

    val solver = BestTimeToBuyAndSellStock()

    @Test
    fun example1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 5
        val actual = solver.maxProfit(prices)
        assert(expected == actual)
    }

    @Test
    fun example2() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0
        val actual = solver.maxProfit(prices)
        assert(expected == actual)
    }

}