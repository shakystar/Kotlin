package behavioral.observer.observer

import behavioral.observer.event.OrderCompletedEvent

class PointRewardObserver : OrderObserver {
  override fun onOrderCompleted(event: OrderCompletedEvent) {
    val points = event.amount / 100

    println(
      "[포인트] 주문 ${event.orderId}에 대해 ${points}포인트 적립"
    )
  }
}