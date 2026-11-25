package behavioral.observer.event

data class OrderCompletedEvent(
  val orderId: String,
  val customerEmail: String,
  val amount: Int
)