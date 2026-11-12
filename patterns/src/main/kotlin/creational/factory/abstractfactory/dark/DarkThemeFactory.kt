package creational.factory.abstractfactory.dark

import creational.factory.abstractfactory.product.Button
import creational.factory.abstractfactory.product.Checkbox
import creational.factory.abstractfactory.ThemeFactory

class DarkThemeFactory : ThemeFactory {
  override fun createButton(): Button {
    return DarkButton()
  }

  override fun createCheckbox(): Checkbox {
    return DarkCheckbox()
  }
}