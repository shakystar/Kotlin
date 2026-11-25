package behavioral.state.state

interface OrderState {
  fun cancel(): OrderState
}