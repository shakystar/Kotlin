package structural.flyweight.factory

import structural.flyweight.shared.TreeType

object TreeTypeFactory {
  private data class TreeTypeKey(
    val name: String,
    val color: String,
    val imagePath: String
  )

  private val treeTypes = mutableMapOf<TreeTypeKey, TreeType>()

  fun getTreeType(
    name: String,
    color: String,
    imagePath: String
  ): TreeType {
    val key = TreeTypeKey(name, color, imagePath)

    return treeTypes.getOrPut(key) {
      TreeType(name, color, imagePath)
    }
  }
}