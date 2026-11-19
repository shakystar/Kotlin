package structural.composite.leaf

import structural.composite.component.FileSystemEntry

class FileItem(
  override val name: String,
  private val sizeInKb: Int
) : FileSystemEntry {
  init {
    require(sizeInKb >= 0) {
      "파일 크기는 0 이상이어야 합니다."
    }
  }

  override fun size(): Int {
    return sizeInKb
  }
}