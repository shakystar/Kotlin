package structural.adapter.provider.newprovider

class NewEmailClient {
  fun deliver(content: String, subject: String) {
    println("[새 이메일 업체]")
    println("제목 : $subject")
    println("본문 : $content")
  }
}