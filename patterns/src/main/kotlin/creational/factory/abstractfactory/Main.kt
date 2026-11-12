package creational.factory.abstractfactory

import creational.factory.abstractfactory.light.LightThemeFactory
import creational.factory.abstractfactory.dark.DarkThemeFactory

fun main() {
  val lightScreen = Screen(LightThemeFactory())
  lightScreen.render()

  val darkScreen = Screen(DarkThemeFactory())
  darkScreen.render()
}