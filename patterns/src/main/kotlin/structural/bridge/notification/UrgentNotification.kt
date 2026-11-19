package structural.bridge.notification

import structural.bridge.channel.MessageChannel

class UrgentNotification(
  channel: MessageChannel
) : Notification(channel) {

  override fun send(message: String) {
    channel.deliver("[긴급] 즉시 확인해주세요 : ${message}")
  }
}