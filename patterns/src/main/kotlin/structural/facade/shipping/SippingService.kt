package structural.facade.shipping

class ShippingService {
  fun requestDelivery(address: String) {
    require(address.isNotBlank()) {
      "배송지는 비어 있을 수 없습니다."
    }

    println("[배송] ${address}로 배송 접수 완료")
  }
}