package structural.bridge

import structural.bridge.channel.EmailChannel
import structural.bridge.channel.MessageChannel
import structural.bridge.channel.SmsChannel
import structural.bridge.notification.NormalNotification
import structural.bridge.notification.Notification
import structural.bridge.notification.UrgentNotification

fun main() {
  val emailChannel = EmailChannel()
  val smsChannel = SmsChannel()

  val notifications: List<Notification> = listOf(
    NormalNotification(emailChannel),
    NormalNotification(smsChannel),
    UrgentNotification(emailChannel),
    UrgentNotification(smsChannel)
  )

  for (notification in notifications) {
    notification.send("서버 점검이 예정되어 있습니다.")
  }
}