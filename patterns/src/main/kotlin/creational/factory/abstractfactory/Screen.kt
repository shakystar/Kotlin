package creational.factory.abstractfactory

import creational.factory.abstractfactory.product.Button
import creational.factory.abstractfactory.product.Checkbox

class Screen(factory: ThemeFactory) {
  private val button: Button = factory.createButton()
  private val checkbox: Checkbox = factory.createCheckbox()

  fun render() {
    button.render()
    checkbox.render()
  }
}