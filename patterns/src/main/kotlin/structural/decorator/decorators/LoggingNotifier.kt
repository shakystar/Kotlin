package structural.decorator.decorators

import structural.decorator.notification.Notifier

class LoggingNotifier(
  private val wrapped: Notifier
) : Notifier {
  override fun send(message: String) {
    println("[로그] 알림 전송 시작")

    wrapped.send(message)

    println("[로그] 알림 전송 완료")
  }
}