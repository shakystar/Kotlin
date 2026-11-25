package behavioral.state.state

object PendingPaymentState : OrderState {
  override fun cancel(): OrderState {
    println("결제 대기 중인 주문을 취소했습니다.")
    return CancelledState
  }
}