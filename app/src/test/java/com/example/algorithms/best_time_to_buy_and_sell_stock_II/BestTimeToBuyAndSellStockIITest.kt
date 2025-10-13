package com.example.algorithms.best_time_to_buy_and_sell_stock_II

import kotlin.test.Test

class BestTimeToBuyAndSellStockIITest {

    val solver = BestTimeToBuyAndSellStockII()

    @Test
    fun example1() {
        val input = intArrayOf(7, 1, 5, 3, 6, 4)
        val expected = 7
        val actual = solver.maxProfit(input)
        assert(expected == actual)
    }

    @Test
    fun example2() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val expected = 4
        val actual = solver.maxProfit(input)
        assert(expected == actual)
    }

    @Test
    fun example3() {
        val input = intArrayOf(7, 6, 4, 3, 1)
        val expected = 0
        val actual = solver.maxProfit(input)
        assert(expected == actual)
    }
}