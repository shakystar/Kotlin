package structural.bridge.channel

class SmsChannel : MessageChannel {
  override fun deliver(message: String) {
    println("[문자] ${message}")
  }
}