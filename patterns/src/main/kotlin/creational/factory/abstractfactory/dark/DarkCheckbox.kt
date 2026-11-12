package creational.factory.abstractfactory.dark

import creational.factory.abstractfactory.product.Checkbox

class DarkCheckbox : Checkbox {
  override fun render() {
    println("어두운 테마 체크박스")
  }
}