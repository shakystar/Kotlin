fun main() {
  SharedState.userName.value = "테스트명"
  SharedState.count.value = 10

  println(SharedState.userName.value)
  println(SharedState.count.value)
}