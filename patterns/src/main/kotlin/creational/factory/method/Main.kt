fun main() {
  val emailService: NotificationService = EmailNotificationService()
  val smsService: NotificationService = SmsNotificationService()

  emailService.notify("가입을 환영합니다.")
  smsService.notify("인증번호는 1234입니다.")
}