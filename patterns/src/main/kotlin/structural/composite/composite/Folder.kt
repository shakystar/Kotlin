package structural.composite.composite

import structural.composite.component.FileSystemEntry

class Folder(
  override val name: String
) : FileSystemEntry {
  private val children = mutableListOf<FileSystemEntry>()

  fun add(entry: FileSystemEntry) {
    children.add(entry)
  }

  override fun size(): Int {
    var total = 0

    for (child in children) {
      total += child.size()
    }
    
    return total
  }
}
