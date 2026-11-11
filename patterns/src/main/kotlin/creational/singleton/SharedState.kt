object SharedState {
  val userName = State<String>("")
  val count = State<Int>(0)
  val isLoggedIn = State<Boolean>(false)
}