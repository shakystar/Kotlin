package creational.factory.abstractfactory.light

import creational.factory.abstractfactory.product.Button
import creational.factory.abstractfactory.product.Checkbox
import creational.factory.abstractfactory.ThemeFactory

class LightThemeFactory : ThemeFactory {
  override fun createButton(): Button {
    return LightButton()
  }

  override fun createCheckbox(): Checkbox {
    return LightCheckbox()
  }
}