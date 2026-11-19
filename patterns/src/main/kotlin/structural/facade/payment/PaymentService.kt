package structural.facade.payment

class PaymentService {
  fun pay(amount: Int) {
    require(amount > 0) {
      "결제 금액은 0보다 커야 합니다."
    }

    println("[결제] ${amount}원 결제 완료")
  }
}