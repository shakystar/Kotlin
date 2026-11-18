package structural.adapter.provider.original

class ExternalEmailClient {
  fun sendEmail(title: String, body: String) {
    println("제목: $title")
    println("본문: $body")
  }
}