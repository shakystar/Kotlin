fun main() {
  val email = NotificationFactory.create("email")
  val sms = NotificationFactory.create("sms")

  email.send("가입을 환영합니다.")
  sms.send("인증번호는 1234입니다.")
}