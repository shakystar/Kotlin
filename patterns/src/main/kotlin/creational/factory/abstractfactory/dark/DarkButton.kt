package creational.factory.abstractfactory.dark

import creational.factory.abstractfactory.product.Button

class DarkButton : Button {
  override fun render() {
    println("어두운 테마 버튼")
  }
}