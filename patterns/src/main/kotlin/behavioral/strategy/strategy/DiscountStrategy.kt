package behavioral.strategy.strategy

interface DiscountStrategy {
  fun applyDiscount(amount: Int): Int
}