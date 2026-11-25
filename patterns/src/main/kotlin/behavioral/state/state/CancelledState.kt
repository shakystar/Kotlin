package behavioral.state.state

object CancelledState : OrderState {
  override fun cancel(): OrderState {
    println("이미 취소된 주문입니다.")
    return this
  }
}