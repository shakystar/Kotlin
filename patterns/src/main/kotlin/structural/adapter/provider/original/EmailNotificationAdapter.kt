package structural.adapter.provider.original

import structural.adapter.notification.Notifier

class EmailNotificationAdapter(
  private val client: ExternalEmailClient
) : Notifier {
  override fun send(message: String) {
    client.sendEmail(
      title = "알림",
      body = message
    )
  }
}