package behavioral.observer.observer

import behavioral.observer.event.OrderCompletedEvent

interface OrderObserver {
  fun onOrderCompleted(event: OrderCompletedEvent)
}