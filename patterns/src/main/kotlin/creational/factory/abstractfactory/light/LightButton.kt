package creational.factory.abstractfactory.light

import creational.factory.abstractfactory.product.Button

class LightButton : Button {
  override fun render() {
    println("밝은 테마 버튼")
  }
}