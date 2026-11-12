package creational.factory.abstractfactory

import creational.factory.abstractfactory.product.Button
import creational.factory.abstractfactory.product.Checkbox

interface ThemeFactory {
  fun createButton(): Button
  fun createCheckbox(): Checkbox
}