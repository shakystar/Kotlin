package behavioral.state.state

object ShippingState : OrderState {
  override fun cancel(): OrderState {
    println("배송 중인 주문은 취소할 수 없습니다.")
    return this
  }
}