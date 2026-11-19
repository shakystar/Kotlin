package behavioral.strategy.strategy

class PercentageDiscount(
  private val percent: Int
) : DiscountStrategy {

  init {
    require(percent in 0..100) {
      "할인율은 0부터 100 사이여야 합니다."
    }
  }

  override fun applyDiscount(amount: Int): Int {
    require(amount >= 0) {
      "주문 금액은 0 이상이어야 합니다."
    }

    val discountAmount = amount.toLong() * percent / 100

    return (amount - discountAmount).toInt()
  }
}