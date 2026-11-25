package behavioral.state.order

import behavioral.state.state.OrderState
import behavioral.state.state.PendingPaymentState

class Order(initialState: OrderState = PendingPaymentState) {
  private var state: OrderState = initialState

  fun cancel() {
    state = state.cancel()
  }
}