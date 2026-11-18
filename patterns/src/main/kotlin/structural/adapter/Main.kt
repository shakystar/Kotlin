package structural.adapter

import structural.adapter.notification.Notifier
import structural.adapter.signup.SignupService
import structural.adapter.provider.original.EmailNotificationAdapter
import structural.adapter.provider.original.ExternalEmailClient
import structural.adapter.provider.newprovider.NewEmailClient
import structural.adapter.provider.newprovider.NewEmailNotifierAdapter

fun main() {
  val originalNotifier = EmailNotificationAdapter(
    ExternalEmailClient()
  )

  val newNotifier = NewEmailNotifierAdapter(
    NewEmailClient()
  )
  
  runSignupExample("기존 업체", originalNotifier)
  runSignupExample("새 업체", newNotifier)
}

fun runSignupExample(label: String, notifier: Notifier) {
  println("=== $label ===")

  val signupService = SignupService(notifier)
  signupService.signup("민수")

  println()
}