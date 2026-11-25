package behavioral.observer.service

import behavioral.observer.event.OrderCompletedEvent
import behavioral.observer.observer.OrderObserver

class OrderService {
  private val observers = mutableSetOf<OrderObserver>()

  fun addObserver(observer: OrderObserver) {
    observers.add(observer)
  }

  fun removeObserver(observer: OrderObserver) {
    observers.remove(observer)
  }

  fun completeOrder(
    orderId: String,
    customerEmail: String,
    amount: Int
  ) {
    require(orderId.isNotBlank()) {
      "주문 번호는 비어 있을 수 없습니다."
    }
    require(customerEmail.isNotBlank()) {
      "이메일 주소는 비어 있을 수 없습니다."
    }
    require(amount >= 0) {
      "주문 금액은 0 이상이어야 합니다."
    }

    println("[주문] ${orderId} 완료")

    val event = OrderCompletedEvent(
      orderId = orderId,
      customerEmail = customerEmail,
      amount = amount
    )

    for (observer in observers.toList()) {
      observer.onOrderCompleted(event)
    }
  }
}