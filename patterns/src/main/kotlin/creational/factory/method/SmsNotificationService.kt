class SmsNotificationService: NotificationService() {
  override fun createNotification(): Notification {
    return SmsNotification()
  }
}