package structural.decorator

import structural.decorator.decorators.LoggingNotifier
import structural.decorator.decorators.PrefixNotifier
import structural.decorator.notification.ConsoleNotifier
import structural.decorator.notification.Notifier

fun main() {
  val basic: Notifier = ConsoleNotifier()
  val withLogging: Notifier = LoggingNotifier(basic)
  val combined: Notifier = LoggingNotifier(
    PrefixNotifier(
      wrapped = basic,
      prefix = "[주문] "
    )
  )

  println("=== 기본 알림 ===")
  basic.send("가입을 환영합니다.")

  println()

  println("=== 로그를 추가한 알림 ===")
  withLogging.send("가입을 환영합니다.")

  println()

  println("=== 로그 + 접두사 알림 ===")
  combined.send("결제가 완료되었습니다.")
}