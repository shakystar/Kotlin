package structural.flyweight.shared

class TreeType(
  val name: String,
  val color: String,
  val imagePath: String
) {
  fun draw(x: Int, y: Int) {
    println(
      "${name}: 위치=(${x}, ${y}), 색상=${color}, 이미지=${imagePath}"
    )
  }
}