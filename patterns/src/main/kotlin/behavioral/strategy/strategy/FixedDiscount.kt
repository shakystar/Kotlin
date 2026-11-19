package behavioral.strategy.strategy

class FixedDiscount(
  private val discountAmount: Int
) : DiscountStrategy {

  init {
    require(discountAmount >= 0) {
      "할인 금액은 0 이상이어야 합니다."
    }
  }

  override fun applyDiscount(amount: Int): Int {
    require(amount >= 0) {
      "주문 금액은 0 이상이어야 합니다."
    }

    return (amount - discountAmount).coerceAtLeast(0)
  }
}