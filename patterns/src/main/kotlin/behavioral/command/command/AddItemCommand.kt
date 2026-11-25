package behavioral.command.command

import behavioral.command.cart.ShoppingCart

class AddItemCommand(
  private val cart: ShoppingCart,
  private val product: String
) : CartCommand {

  override fun execute() {
    cart.addOne(product)
  }

  override fun undo() {
    cart.removeOne(product)
  }
}