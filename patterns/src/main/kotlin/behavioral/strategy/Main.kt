package behavioral.strategy

import behavioral.strategy.service.OrderService
import behavioral.strategy.strategy.FixedDiscount
import behavioral.strategy.strategy.PercentageDiscount

fun main() {
  try {
    val amount = 20000

    val fixedDiscountOrder = OrderService(
      discountStrategy = FixedDiscount(discountAmount = 1000)
    )

    val percentageDiscountOrder = OrderService(
      discountStrategy = PercentageDiscount(percent = 10)
    )

    println("원래 금액: ${amount}원")
    println(
      "정액 할인 적용: ${fixedDiscountOrder.calculateFinalAmount(amount)}원"
    )
    println(
      "정률 할인 적용: ${percentageDiscountOrder.calculateFinalAmount(amount)}원"
    )
  } catch (e: IllegalArgumentException) {
    println("할인 계산 실패: ${e.message}")
  }
}