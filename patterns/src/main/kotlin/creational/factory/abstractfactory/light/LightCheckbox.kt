package creational.factory.abstractfactory.light

import creational.factory.abstractfactory.product.Checkbox

class LightCheckbox : Checkbox {
  override fun render() {
    println("밝은 테마 체크박스")
  }
}