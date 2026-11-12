fun main() {
  val original = Character(
    name = "기본 전사",
    level = 1,
    health = 100,
    items = mutableListOf("검")
  )

  val copied = original.copy(
    name = "새로운 전사",
    items = original.items.toMutableList()
  )

  copied.items.add("방패")

  println(original.items)
  println(copied.items)

  println(original === copied)
  println(original.items === copied.items)
}