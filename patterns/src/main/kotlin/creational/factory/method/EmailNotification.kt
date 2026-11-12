class EmailNotification : Notification {
  override fun send(message : String) {
    println("이메일 알림 : $message")
  }
}