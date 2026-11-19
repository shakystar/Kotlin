package structural.bridge.notification

import structural.bridge.channel.MessageChannel

class NormalNotification(
  channel: MessageChannel
) : Notification(channel) {

  override fun send(message: String) {
    channel.deliver("[일반] ${message}")
  }
}