package structural.bridge.channel

interface MessageChannel {
  fun deliver(message: String)
}