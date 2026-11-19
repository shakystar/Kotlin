package structural.flyweight

import structural.flyweight.factory.TreeTypeFactory
import structural.flyweight.model.Tree

fun main() {
  val pineType1 = TreeTypeFactory.getTreeType(
    name = "소나무",
    color = "초록",
    imagePath = "pine.png"
  )
  
  val pineType2 = TreeTypeFactory.getTreeType(
    name = "소나무",
    color = "초록",
    imagePath = "pine.png"
  )

  val mapleType = TreeTypeFactory.getTreeType(
    name = "딘풍나무",
    color = "빨강",
    imagePath = "maple.png"
  )

  println("같은 종류 공유 : ${pineType1 === pineType2}")
  println("다른 종류 공유 : ${pineType1 === mapleType}")

  val trees = listOf(
    Tree(x = 10, y = 20, type = pineType1),
    Tree(x = 30, y = 40, type = pineType2),
    Tree(x = 50, y = 60, type = mapleType)
  )

  for (tree in trees) {
    tree.draw()
  }
}