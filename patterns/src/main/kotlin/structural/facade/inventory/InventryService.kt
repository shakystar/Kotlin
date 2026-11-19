package structural.facade.inventory

class InventoryService {
  fun checkStock(productId: String, quantity: Int) {
    require(quantity > 0) {
      "수량은 1개 이상이어야 합니다."
    }

    println("[재고] 상품 ${productId}, 수량 ${quantity}개 확인 완료")
  }
}