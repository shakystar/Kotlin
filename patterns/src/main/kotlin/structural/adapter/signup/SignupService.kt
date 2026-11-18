package structural.adapter.signup

import structural.adapter.notification.Notifier

class SignupService(
  private val notifier: Notifier
) {
  fun signup(name: String) {
    println("$name 님의 회원가입 완료")

    notifier.send("$name 님, 가입을 환영합니다.")
  }
}