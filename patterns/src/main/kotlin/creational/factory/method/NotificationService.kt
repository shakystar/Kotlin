abstract class NotificationService {
  abstract fun createNotification(): Notification

  fun notify(message: String) {
    val notification = createNotification()
    notification.send(message)
  }
}