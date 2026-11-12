object NotificationFactory {
  fun create(type: String): Notification {
    return when (type) {
      "email" -> EmailNotification()
      "sms" -> SmsNotification()
      else -> throw IllegalArgumentException("지원하지 않는 알림 : $type")
    }
  }
}