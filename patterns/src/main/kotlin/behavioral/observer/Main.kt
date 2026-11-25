package behavioral.observer

import behavioral.observer.observer.EmailNotificationObserver
import behavioral.observer.observer.PointRewardObserver
import behavioral.observer.service.OrderService

fun main() {
  val orderService = OrderService()

  val emailObserver = EmailNotificationObserver()
  val pointObserver = PointRewardObserver()

  orderService.addObserver(emailObserver)
  orderService.addObserver(pointObserver)

  try {
    println("=== 관찰자 두 개 등록 ===")

    orderService.completeOrder(
      orderId = "ORDER-001",
      customerEmail = "user@example.com",
      amount = 20000
    )

    orderService.removeObserver(emailObserver)

    println()
    println("=== 이메일 관찰자 해제 ===")

    orderService.completeOrder(
      orderId = "ORDER-002",
      customerEmail = "user@example.com",
      amount = 30000
    )
  } catch (e: IllegalArgumentException) {
    println("주문 처리 오류 : ${e.message}")
  }
}