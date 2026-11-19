package structural.composite.component

interface FileSystemEntry {
  val name: String
  
  fun size(): Int
}