package structural.decorator.notification

class ConsoleNotifier : Notifier {
  override fun send(message: String) {
    println("알림 전송: $message")
  }
}