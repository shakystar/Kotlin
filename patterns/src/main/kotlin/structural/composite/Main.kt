package structural.composite

import structural.composite.component.FileSystemEntry
import structural.composite.composite.Folder
import structural.composite.leaf.FileItem

fun main() {
  val memo = FileItem("메모.txt", 10)
  val mainFile = FileItem("Main.kt", 20)
  val orderFile = FileItem("Order.kt", 30)

  val examples = Folder("예제 폴더")
  examples.add(mainFile)
  examples.add(orderFile)

  val study = Folder("학습 폴더")
  study.add(memo)
  study.add(examples)

  printSize(memo)
  printSize(examples)
  printSize(study)
}

fun printSize(entry: FileSystemEntry) {
  println("${entry.name}: ${entry.size()}KB")
}