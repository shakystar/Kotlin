class EmailNotificationService : NotificationService() {
  override fun createNotification(): Notification {
    return EmailNotification()
  }
}