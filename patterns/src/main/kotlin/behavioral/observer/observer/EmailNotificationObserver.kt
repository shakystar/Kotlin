package behavioral.observer.observer

import behavioral.observer.event.OrderCompletedEvent

class EmailNotificationObserver : OrderObserver {
  override fun onOrderCompleted(event: OrderCompletedEvent) {
    println(
      "[이메일] ${event.customerEmail}로 주문 ${event.orderId} 완료 안내"
    )
  }
}