package structural.bridge.channel

class EmailChannel : MessageChannel {
  override fun deliver(message: String) {
    println("[이메일] ${message}")
  }
}