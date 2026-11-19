package behavioral.strategy.service

import behavioral.strategy.strategy.DiscountStrategy

class OrderService(
  private val discountStrategy: DiscountStrategy
) {
  fun calculateFinalAmount(amount: Int): Int {
    return discountStrategy.applyDiscount(amount)
  }
}