package behavioral.command

import behavioral.command.cart.ShoppingCart
import behavioral.command.command.AddItemCommand
import behavioral.command.history.CommandHistory

fun main() {
  val cart = ShoppingCart()
  val history = CommandHistory()

  val addApple = AddItemCommand(cart, "사과")
  val addBanana = AddItemCommand(cart, "바나나")

  printCart("명령 생성 후 ", cart)

  history.execute(addApple)
  printCart("사과 추가 후 ", cart)

  history.execute(addBanana)
  printCart("바나나 추가 후", cart)

  history.undoLast()
  printCart("첫 번째 취소 후", cart)
  
  history.undoLast()
  printCart("두 번째 취소 후", cart)
}

private fun printCart(label: String, cart: ShoppingCart) {
  val apples = cart.quantityOf("사과")
  val bananas = cart.quantityOf("바나나")
  println("${label}: 사과 ${apples}개, 바나나 ${bananas}개")
}