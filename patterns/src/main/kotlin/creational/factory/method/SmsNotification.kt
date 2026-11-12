class SmsNotification : Notification {
  override fun send(message: String) {
    println("문자 알림 : $message")
  }
}