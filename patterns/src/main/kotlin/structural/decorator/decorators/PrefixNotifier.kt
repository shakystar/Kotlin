package structural.decorator.decorators

import structural.decorator.notification.Notifier

class PrefixNotifier(
  private val wrapped: Notifier,
  private val prefix: String
) : Notifier {
  override fun send(message: String) {
    wrapped.send("$prefix$message")
  }
}