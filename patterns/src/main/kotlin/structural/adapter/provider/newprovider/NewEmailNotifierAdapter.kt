package structural.adapter.provider.newprovider

import structural.adapter.notification.Notifier

class NewEmailNotifierAdapter(
  private val client: NewEmailClient
) : Notifier {
  override fun send(message: String) {
    client.deliver(
      content = message,
      subject = "알림"
    )
  }
}