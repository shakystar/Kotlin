package structural.bridge.notification

import structural.bridge.channel.MessageChannel

abstract class Notification(
  protected val channel: MessageChannel
) {
  abstract fun send(message: String)
}