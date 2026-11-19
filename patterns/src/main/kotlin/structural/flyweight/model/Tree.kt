package structural.flyweight.model

import structural.flyweight.shared.TreeType

class Tree(
  private val x: Int,
  private val y: Int,
  private val type: TreeType
) {
  fun draw() {
    type.draw(x, y)
  }
}